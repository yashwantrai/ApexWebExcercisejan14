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
 * Servlet implementation class UpdatePhoneServlet
 */
@WebServlet("/UpdatePhoneServlet")
public class UpdatePhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePhoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Update Phone Servlet");
		String errors = "";
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastname");
		String city =  request.getParameter("city");
		String oldPhone =  request.getParameter("oldPhoneNum");
		String newPhone = request.getParameter("newPhonenum");
		try {
			EmployeeInfo emp=EmployeeDao.getEmployee(oldPhone);
			if(firstName.equals(emp.getFirstName())&&(lastName.equals(emp.getLastname()))&&city.equals(emp.getCity())) {
				errors+=Validations.validatePhone(newPhone);
				if (errors.equals("")) {
					emp.setPhone(newPhone);
					EmployeeDao.addEmployee(emp);
					EmployeeDao.deleteEmployee(oldPhone);
					request.getSession().setAttribute("emp", emp);
					request.getRequestDispatcher("success.jsp").forward(request, response);
				}
				} else  {
				errors+="details are not matching";
			}
			
		} catch (Exception e) {
			errors+="Issue in Locating the record";
			e.printStackTrace();
		}
		
		if (!(errors.equals(""))){
    		System.out.println("error display");
    		request.getSession().setAttribute("Errors", errors);
    		response.sendRedirect("updatePhone.jsp");
    	}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
