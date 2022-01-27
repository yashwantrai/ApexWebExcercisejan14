package com.apex.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apex.pojo.EmployeeInfo;
import com.apex.pojo.Validations;

/**
 * Servlet implementation class ContactInfoServlet
 */
@WebServlet("/ContactInfoServlet")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactInfoServlet() {
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
		
		System.out.println("ContactInfo servlet Post ");
		EmployeeInfo emp= (EmployeeInfo) request.getSession().getAttribute("emp");
		String address= request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String phone = request.getParameter("phone");
		String country = request.getParameter("country");
		String errors = "";
		
		
		errors+=Validations.validateAddress(address);
		errors+=Validations.validateCity(city);
		errors+=Validations.validateCountry(country);
		errors+=Validations.validateState(state);
		errors+=Validations.validatePhone(phone);
		
		
		
		if (errors.equals("")){
		
		emp.setAddress(request.getParameter("address"));
		emp.setCity(request.getParameter("city"));
		emp.setState(request.getParameter("state"));
		emp.setPhone(request.getParameter("phone"));
		emp.setCountry(request.getParameter("country"));
		
		request.getRequestDispatcher("bankInfo.jsp").forward(request, response);
		} else {
			System.out.println("error display");
    		request.getSession().setAttribute("Errors", errors);
    		response.sendRedirect("contactInfo.jsp");
		}
	}

}
