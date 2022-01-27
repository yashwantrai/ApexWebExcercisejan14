package com.apex.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apex.dao.EmployeeDao;
import com.apex.pojo.EmployeeInfo;
import com.apex.pojo.Validations;

/**
 * Servlet implementation class UpdateEmployeeinfo
 */
@WebServlet("/UpdateEmployeeinfo")
public class UpdateEmployeeinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Update Employee post");
		EmployeeInfo emp= (EmployeeInfo) request.getSession().getAttribute("emp");
		String errors = "";
		System.out.println(emp);
		String firstName= request.getParameter("firstName");
		String middleName=request.getParameter("middlename");
		String lastName=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String address= request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String phone = request.getParameter("phone");
		String country = request.getParameter("country");
		
		errors+=Validations.validateFirstName(firstName);
		errors+=Validations.validateMiddleName(middleName);
		errors+=Validations.validateLastName(lastName);	
		errors+=Validations.validateGender(gender);
		errors+=Validations.validateAddress(address);
		errors+=Validations.validateCity(city);
		errors+=Validations.validateCountry(country);
		errors+=Validations.validateState(state);
	//	errors+=Validations.validatePhone(phone);
		
		if (errors.equals("")){
    		emp.setFirstName(request.getParameter("firstName"));
    		emp.setLastname(request.getParameter("lastname"));
    		emp.setMiddlename(request.getParameter("middlename"));
    		emp.setGender(request.getParameter("gender"));
    		emp.setFirstName(request.getParameter("firstName"));
    		emp.setAddress(request.getParameter("address"));
    		emp.setCity(request.getParameter("city"));
    		emp.setState(request.getParameter("state"));
    //		emp.setPhone(request.getParameter("phone"));
    		emp.setCountry(request.getParameter("country"));
    		emp.setBank(request.getParameter("bank"));
    		emp.setAccount(request.getParameter("account"));
    		emp.setSsn(request.getParameter("ssn"));
    		
    		System.out.println("Updated results");
    		System.out.println(emp);
    		try {
				EmployeeDao.UpdateEmployee(emp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		request.getRequestDispatcher("getemployee.jsp").forward(request, response);
    		
    	} else {
    		System.out.println("error display");
    		
    		request.getSession().setAttribute("Errors", errors);
    		response.sendRedirect("registration.jsp");
    	}
		
		
	}

}
