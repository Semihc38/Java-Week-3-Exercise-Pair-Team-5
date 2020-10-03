package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.techelevator.Person;

/***************************************************************
 * 
 * Declare a `Customer` class that inherits the `Person` class.
 * 
 * One that accepts three `String` parameters for first name, last name, and phone number.
 * This constructor must set the phone number property, and call the base class constructor for first and last name.
 * One that accepts two `String` parameters for first name and last name.
 * 
 ***************************************************************/

public class Customer extends Person {

	/***************************************************************
	 * Instance Variables
	 ***************************************************************/
	
	private String phoneNumber; // Customer's phone number
	private List<Pet> pets; // collection of customer's pets
	
	/***************************************************************
	 * Constructors
	 ***************************************************************/
	
	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		pets = new ArrayList<Pet>();
		this.phoneNumber = phoneNumber;
	}
	
	/***************************************************************
	 * 
	 * This constructor must call the above constructor
	 *  with an empty string for phone number.
	 *  
	 ***************************************************************/
	
	public Customer(String firstName, String lastName) {
		firstName = getFirstName();
		lastName = getLastName();
		pets = new ArrayList<Pet>();
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
	
	/***************************************************************
	 * Implemented from interface 
	 ***************************************************************/
	
	@Override
	public double getBalanceDue(Map<String, Double> servicesRendered) {
		double price=0;
		
		for(Entry<String, Double> each: servicesRendered.entrySet()) {
	
			price+=each.getValue();
		}
		return price;
	}
}
	
	


