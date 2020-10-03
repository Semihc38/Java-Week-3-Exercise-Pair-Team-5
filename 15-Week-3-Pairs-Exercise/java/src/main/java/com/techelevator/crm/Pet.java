package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	/***************************************************************
	 * Instance Variables
	 ***************************************************************/
	
	private String name; // Name of pet
	private String species; // Species of pet, like dog or cat
	private List<String> vaccinations; // Vaccinations the pet has received
	
	/***************************************************************
	 * Constructor
	 * 
	 * Remember to set `vaccinations` to a new initialized `ArrayList`. 
	 * You can do this in the property declaration or constructor.
	 * 
	 * Create one constructor for `Pet` that accepts two `String`s to set `name` and `species`.
	 * 
	 ***************************************************************/
	
	public Pet(String name, String species) {
		this.name = name;
		this.species = species; 	
		vaccinations = new ArrayList<String>();
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
	 * 
	 * The `listVaccinations` method returns the elements of `vaccinations` as a comma-delimited string. For example, if the `List` contains 
	 * `["Rabies", "Distemper", "Parvo"]`, 
	 * the output must be `"Rabies, Distemper, Parvo"`.
	 * 
	 * Keep in mind the spaces between and not to have a trailing comma.
	 * 
	 ***************************************************************/
	
	public String listVaccinations() {
		
		String string = "";
		
		for (int i = 0; i < vaccinations.size(); i++) {
			
			if (i != vaccinations.size()-1) {
				string += vaccinations.get(i) + ", ";
			
			} else {
				string += vaccinations.get(i);
			}
		}
		return string;
		
	}

	
	
}
