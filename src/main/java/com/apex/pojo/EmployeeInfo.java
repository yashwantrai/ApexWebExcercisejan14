package com.apex.pojo;

public class EmployeeInfo {

	private String firstName;
	private String lastname;
	private String middlename;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phone;
	private String bank;
	private String account;
	private String ssn;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeInfo [firstName=" + firstName + ", lastname=" + lastname + ", middlename=" + middlename
				+ ", gender=" + gender + ", address=" + address + ", city=" + city + ", state=" + state + ", country="
				+ country + ", phone=" + phone + ", bank=" + bank + ", account=" + account + ", ssn=" + ssn + "]";
	}
	public EmployeeInfo(String firstName, String lastname, String middlename, String gender, String address,
			String city, String state, String country, String phone, String bank, String account, String ssn) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.middlename = middlename;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.bank = bank;
		this.account = account;
		this.ssn = ssn;
	}
	public EmployeeInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
