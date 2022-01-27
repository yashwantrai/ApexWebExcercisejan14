package com.apex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.apex.pojo.EmployeeInfo;

public class EmployeeDao {
	
	
	
	
	
	public static Connection getConnection() throws Exception{
		Connection dbConn = null;
    try{
    //step1:
    Class.forName("com.mysql.jdbc.Driver");
	//step2
    String url = "jdbc:mysql://localhost:3306/test";
	//step3
	dbConn = DriverManager.getConnection(url, "root", "root");
	}
     catch (SQLException sqle) {
	   sqle.printStackTrace();
	   throw sqle;
	}
         catch(Exception e) {
        	 System.out.println("connection error");
	   e.printStackTrace();
	   throw e;
	}
    System.out.println("connection successfull");
return dbConn;
}
	public static EmployeeInfo getEmployee(String phone) throws SQLException, Exception{

	    Connection dbConn = null;
	    PreparedStatement pStmt = null;
            ResultSet rs = null;
          EmployeeInfo emp = new EmployeeInfo();
       try{
		dbConn = getConnection();
		
		pStmt = dbConn.prepareStatement("SELECT * FROM test.Employee WHERE phone = ?");
		pStmt.setString(1, phone);
   		rs = pStmt.executeQuery();
   		
   		
		if (rs.next()) {
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			
			emp.setFirstName(rs.getString(1));
			emp.setLastname(rs.getString(2));
			emp.setMiddlename(rs.getString(3));
			emp.setGender(rs.getString(4));
			emp.setAddress(rs.getString(5));
			emp.setCity(rs.getString(6));
			emp.setState(rs.getString(7));
			emp.setCountry(rs.getString(8));
			emp.setPhone(rs.getString(9));
			emp.setBank(rs.getString(10));
			emp.setAccount(rs.getString(11));
			emp.setSsn(rs.getString(12));
			
   		}
       }catch(SQLException sqe){
    	   //log the error
    	   sqe.printStackTrace();
    	   //throw the exception
    	   throw sqe;
       } finally{
    	   rs.close();
    	   pStmt.close();
    	   dbConn.close();
       }

		return emp;
	}
	public static void addEmployee(EmployeeInfo emp)  throws Exception{
		System.out.println("employee dao 1");
	    Connection dbConn = null;
	    PreparedStatement pStmt = null;
	    int rowsInserted = 0;
	    System.out.println("employee dao 2");
	     try{
		dbConn = getConnection();
		
		pStmt = dbConn.prepareStatement("INSERT INTO test.Employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		pStmt.setString(1, emp.getFirstName());
		pStmt.setString(2, emp.getLastname());
		pStmt.setString(3, emp.getMiddlename());
		pStmt.setString(4, emp.getGender());
		pStmt.setString(5, emp.getAddress());
		pStmt.setString(6, emp.getCity());
		pStmt.setString(7, emp.getState());
		pStmt.setString(8, emp.getCountry());
		pStmt.setString(9, emp.getPhone());
		pStmt.setString(10, emp.getBank());
		pStmt.setString(11, emp.getAccount());
		pStmt.setString(12, emp.getSsn());
		
		System.out.println("employee dao 3");
   		rowsInserted = pStmt.executeUpdate();

		if (rowsInserted != 1) {
			throw new Exception("Error in inserting the row");

   		}
	     }catch (SQLException sqle) {
		     System.out.println(sqle.getErrorCode());
		     System.out.println(sqle.getMessage());
		   sqle.printStackTrace();
		   throw sqle;
		}
             catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		pStmt.close();
		dbConn.close();
	     }
		return;
	}
	public static void UpdateEmployee(EmployeeInfo emp) throws Exception {
		
		Connection dbConn = null;
	    PreparedStatement pStmt = null;
	    int rowsUpdated = 0;

	     try{
		dbConn = getConnection();
		pStmt = dbConn.prepareStatement("UPDATE test.Employee SET firstName=?,lastname=?,middlename=?,gender=?,address=?,city=?,state=?,country=?,bank=?,account=?,ssn=? where phone = ?");

		pStmt.setString(1, emp.getFirstName());
		pStmt.setString(2, emp.getLastname());
		pStmt.setString(3, emp.getMiddlename());
		pStmt.setString(4, emp.getGender());
		pStmt.setString(5, emp.getAddress());
		pStmt.setString(6, emp.getCity());
		pStmt.setString(7, emp.getState());
		pStmt.setString(8, emp.getCountry());
		pStmt.setString(9, emp.getBank());
		pStmt.setString(10, emp.getAccount());
		pStmt.setString(11, emp.getSsn());
		pStmt.setString(12, emp.getPhone());
		
   		rowsUpdated = pStmt.executeUpdate();

   		System.out.println(rowsUpdated);
		if (rowsUpdated != 1) {
			throw new Exception("Error in updating the row");
   		}
	     }catch (SQLException sqle) {
		   sqle.printStackTrace();
		   throw sqle;
		}
             catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		pStmt.close();
		dbConn.close();
	     }
		return;
		
	}
	public static ArrayList getAllEmployee() throws Exception {
		ArrayList<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
		Connection dbConn = null;
	    PreparedStatement pStmt = null;
            ResultSet rs = null;
            EmployeeInfo emp = null;

	     try{

		dbConn = getConnection();
		pStmt = dbConn.prepareStatement("SELECT * FROM test.Employee");
		rs = pStmt.executeQuery();
		while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getString(8));
				System.out.println(rs.getString(9));
				System.out.println(rs.getString(10));
				System.out.println(rs.getString(11));
				System.out.println(rs.getString(12));
				
				emp = new EmployeeInfo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
   		
				System.out.println(emp);
				list.add(emp);
		}
	     }catch (SQLException sqle) {
		   sqle.printStackTrace();
		   throw sqle;
		}catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		rs.close();
		pStmt.close();
		dbConn.close();
	    }
		return list;
		
	}
//	use test;
//	CREATE TABLE `Employee` (
//	  `firstName` varchar(50) NOT NULL default '',
//	  `lastname` varchar(60) NOT NULL default '',
//	  `middlename` varchar(20) NOT NULL default '',
//	  `gender` varchar(60) NOT NULL default '',
//	  `address` varchar(10) NOT NULL default '',
//	  `city` varchar(10) NOT NULL default '',
//	  `state` varchar(10) NOT NULL default '',
//	  `country` varchar(10) NOT NULL default '',
//	  `phone` varchar(10) NOT NULL default '',
//	  `bank` varchar(10) NOT NULL default '',
//	  `account` varchar(10) NOT NULL default '',
//	  `ssn` varchar(10) NOT NULL default '',
//	  PRIMARY KEY  (`phone`)
//	)
	
	public static void main(String[] args) {
	
		EmployeeInfo emp = new EmployeeInfo("a","b", "c", "d", "e", "a","b", "c", "2","d", "e","a");
		try {
			EmployeeDao.addEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteEmployee(String oldPhone) throws Exception {
		 Connection dbConn = null;
		    PreparedStatement pStmt = null;
		    int rowsDeleted = 0;

		     try{
			dbConn = getConnection();
			pStmt = dbConn.prepareStatement("DELETE FROM test.Employee WHERE phone = ?");
			pStmt.setString(1, oldPhone);
			
	   		rowsDeleted = pStmt.executeUpdate();

			if (rowsDeleted != 1) {
				throw new Exception("Error in delete the row");

	   		}
		     }catch (SQLException sqle) {
			   sqle.printStackTrace();
			   throw sqle;
			}
	             catch(Exception e) {
			   e.printStackTrace();
			   throw e;
			}
		     finally {
			pStmt.close();
			dbConn.close();
		     }
			return;
		
	}
	
	
}
