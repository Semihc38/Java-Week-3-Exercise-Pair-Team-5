package com.techelevator;

import java.util.List;

import com.techelevator.crm.Pet;

/***************************************************************
 * 
 * Declare a `Customer` class that inherits the `Person` class.
 * 
 * One that accepts three `String` parameters for first name, last name, and phone number.
 * This constructor must set the phone number property, and call the base class constructor for first and last name.
 * One that accepts two `String` parameters for first name and last name.
 * This constructor must call the above constructor with an empty string for phone number.
 * 
 ***************************************************************/

public class Customer extends Person {

	/***************************************************************
	 * Instance Variables
	 ***************************************************************/
	
	private String phoneNumber;
	private List<Pet> pets;
	
	/***************************************************************
	 * Constructors
	 ***************************************************************/
	
	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
	}
	
	public Customer(String firstName, String lastName) {
		firstName = getFirstName();
		lastName = getLastName();
		phoneNumber = "";
	}
	
	/***************************************************************
	 * Getters
	 ***************************************************************/
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public List<Pet> getPets() {
		return pets;
	}
	
	/***************************************************************
	 * Setters
	 ***************************************************************/

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
