package com.apex.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apex.dao.EmployeeDao;
import com.apex.pojo.EmployeeInfo;


/**
 * Servlet implementation class BankInfoServlet
 */
@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("BankInfo Servlet Post");
		EmployeeInfo emp= (EmployeeInfo) request.getSession().getAttribute("emp");
		
		
		
		
		
		emp.setBank(request.getParameter("bank"));
		emp.setAccount(request.getParameter("account"));
		emp.setSsn(request.getParameter("ssn"));
		
		System.out.println(emp);
		try {
			EmployeeDao.addEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//request.getSession().setAttribute("emp", emp);
		
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}

}
