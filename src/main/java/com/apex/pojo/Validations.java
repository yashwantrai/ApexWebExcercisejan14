package com.apex.pojo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	 String error ="";
	
	public static boolean mandatory(String s) {
		boolean err =false;
		if (s.length()<1) {
			err=true;
		}		
		return err;
	}
	
	public static boolean minLength(String s, int len) {
		boolean err=false;
		if (s.length()<len) {
			System.out.println(s+"length"+s.length());
				err=true;
			
		}		
		return err;
	}
	
	public static boolean pattern(String s, String re) {
		boolean err=false;
		boolean rs = true;
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(s);
		 rs = mt.matches();
		if (!rs) {
			err=true;
		}
		return err;
	}
	
	public static String validateFirstName(String firstName) {
		String errorfn="";
		
		boolean validationError=minLength(firstName,2);
		
		if (validationError){
			errorfn+= "HRMS_R0011: The Firstt Name is less than 2 characters. Please Check and enter a valid First Name.<br/>";
			validationError=false;
		}
		
		String regexString="[a-zA-Z0-9-_.]{1,20}";
		validationError=pattern(firstName,regexString);
		
		if (validationError) {
			validationError=false;
			System.out.println("validatio"+validationError);
			errorfn+= "HRMS_R0010: First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name.<br/>";
		}
		return errorfn;
		}

	public static String validateMiddleName(String middleName) {
		String errorfn="";
		if (middleName.length()>0){
		String regexString="[a-zA-Z0-9-_.]{1,20}";
		boolean validationError=pattern(middleName,regexString);
		System.out.println("middle name 3"+validationError);
		if (validationError) {
			validationError=false;
			System.out.println("validatio"+validationError);
			errorfn+= "HRMS_R0012: Middle Name can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid Middle Name.<br/>";
		}}
		return errorfn;
	}
	public static String validateLastName(String lastName) {
		String errorfn="";
		boolean validationError=minLength(lastName,2);
		if (validationError){
			validationError=false;
			errorfn+= "HRMS_R0015: The Last Name is less than 2 characters. Please Check and enter a valid Last Name.<br/>";
		}	
		String regexString="[a-zA-Z0-9-_.]{1,20}";
		validationError=pattern(lastName,regexString);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R0014: Last Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Last Name.<br/>";
		}
		return errorfn;
	}
	
	public static String validateGender(String gender) {
		String errorfn="";
		if (gender==null) {
			errorfn+= "HRMS_R00XX: Gender to be selected as Male or Female.<br/>";
		}
		return errorfn;
	}

	public static String validateAddress(String address) {
		String errorfn="";
		boolean validationError=mandatory(address);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R00XX: Please specify address.<br/>";
		}
		return errorfn;
	}
	public static String validateCity(String city) {
		String errorfn="";
		boolean validationError=mandatory(city);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R0017: Please specify City.<br/>";
		}
		String regexString="[a-zA-Z0-9-_.]{1,20}";
		validationError=pattern(city,regexString);
		
		if (validationError){
			validationError=false;
			errorfn+= "HRMS_R0018: City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.<br/>";
		}
		
		return errorfn;
	}
	
	public static String validateState(String state) {
		String errorfn="";
		boolean validationError=mandatory(state);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R0019: State is required. Please select one from the list.<br/>";
		}
		return errorfn;
	}
	
	public static String validateCountry(String country) {
		String errorfn="";
		boolean validationError=mandatory(country);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R0020: Country is required. Please select one from the list.<br/>";
		}
		return errorfn;
	}
	
	public static String validatePhone(String phone) {
		String errorfn="";
		boolean validationError=mandatory(phone);
		if (validationError){
			validationError=false;;
			errorfn+= "HRMS_R00XX: Please specify Phone.<br/>";
		}
		String regexString="[0-9]{1,10}";
		validationError=pattern(phone,regexString);
		
		if (validationError){
			validationError=false;
			errorfn+= "HRMS_R0029: Phone number contains 10 digits. Please enter a valid Phone number.<br/>";
		}
		
		return errorfn;
		
	}
	
}
