package com.bldea.onlineCart.pkg;

public class User {

	private String name;
	 private int age;
	 private int phone;
	 private String Email;
	 
	 
	

	/**
	 * @param name
	 * @param age
	 * @param city
	 * @param state
	 */
	public User(String name, int age, int phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phone=phone ;
		this.Email = Email;
		
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	
	
	
}

	