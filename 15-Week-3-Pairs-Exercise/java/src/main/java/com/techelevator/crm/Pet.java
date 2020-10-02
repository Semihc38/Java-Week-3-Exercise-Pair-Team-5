package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	/***************************************************************
	 * Instance Variables
	 ***************************************************************/
	
	private String name;
	private String species;
	private List<String> vaccinations;
	
	/***************************************************************
	 * Constructor
	 ***************************************************************/
	
	public Pet(String name, String species, List<String> vaccinations) {
		this.name = name;
		this.species = species;
		vaccinations = new ArrayList<String>(vaccinations); // I think this sets vaccinations to an arraylist
	}
	
	/***************************************************************
	 * Getters
	 ***************************************************************/
	
	public String getName() {
		return name;
	}

	public List<String> getVaccinations() {
		return vaccinations;
	}

	public String getSpecies() {
		return species;
	}
	
	/***************************************************************
	 * Setters
	 ***************************************************************/
	
	public void setSpecies(String species) {
		this.species = species;
	}

	// Remember to set `vaccinations` to a new initialized `ArrayList`. 
	// You can do this in the property declaration or constructor.
	public void setVaccinations(ArrayList<String>vaccinations) {
		this.vaccinations = vaccinations;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/***************************************************************
	 * Methods
	 ***************************************************************/
	
	public String listVaccinations() {
		return String.join(", ", vaccinations);
		
	}

	
	
}
