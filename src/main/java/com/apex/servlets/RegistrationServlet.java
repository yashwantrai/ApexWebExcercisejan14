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
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("getemployee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Registration Servlet Post");
		String errors = "";
		
		EmployeeInfo emp = new EmployeeInfo();
		
		request.getSession().setAttribute("emp", emp);
		
		String firstName=request.getParameter("firstName");
		String middleName=request.getParameter("middlename");
		String lastName=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		
		errors+=Validations.validateFirstName(firstName);
		errors+=Validations.validateMiddleName(middleName);
		errors+=Validations.validateLastName(lastName);	
		errors+=Validations.validateGender(gender);
		
    	if (errors.equals("")){
    		emp.setFirstName(request.getParameter("firstName"));
    		emp.setLastname(request.getParameter("lastname"));
    		emp.setMiddlename(request.getParameter("middlename"));
    		emp.setGender(request.getParameter("gender"));
    		emp.setFirstName(request.getParameter("firstName"));
    		request.getRequestDispatcher("contactInfo.jsp").forward(request, response);
    	} else {
    		System.out.println("error display");
    		
    		request.getSession().setAttribute("Errors", errors);
    		response.sendRedirect("registration.jsp");
    	}
		
	}

}
