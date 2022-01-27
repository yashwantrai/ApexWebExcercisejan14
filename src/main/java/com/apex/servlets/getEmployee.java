package com.apex.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apex.dao.EmployeeDao;
import com.apex.pojo.EmployeeInfo;

/**
 * Servlet implementation class getEmployee
 */
@WebServlet("/getEmployee")
public class getEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get Employee Servlet get");
		String action = request.getParameter("action");
		String phone = request.getParameter("phone");
		if ("Get".equals(action)) {
			System.out.println("get Employee Servlet get=>");
			try {
				EmployeeInfo emp=EmployeeDao.getEmployee(phone);
				System.out.println(emp);
				request.getSession().setAttribute("emp", emp);
				request.getRequestDispatcher("success.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("Edit".equals(action)) {
			try {
				EmployeeInfo emp=EmployeeDao.getEmployee(phone);
				request.getSession().setAttribute("emp", emp);
				
				request.getRequestDispatcher("editEmployee1.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("Getall".equals(action)) {
			try {
				System.out.println("Getall 1");
				ArrayList<EmployeeInfo> emplist=EmployeeDao.getAllEmployee();
				System.out.println("Getall 2");
				System.out.println(emplist);
				request.getSession().setAttribute("emplist", emplist);
				request.getRequestDispatcher("viewAllEmployee.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if ("updatePhone".equals(action)) {
			System.out.println("Update Phone 1");
			request.getRequestDispatcher("UpdatePhone.jsp").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
