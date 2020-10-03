package com.techelevator.crm;

import static org.junit.Assert.*;

import org.junit.Test;

/***************************************************************
 * 
 * Create a `PetTests` class in the `com.techelevator.crm` package. 
 * Create a test for `listVaccinations`.
 * 
 ***************************************************************/

public class PetTest {
	
	Pet testMethods = new Pet(null, null); // Instantiate an object with the methods to test

	@Test
	public void test_for_listVaccinations() {
		
		testMethods.getVaccinations().add("Rabies");
		testMethods.getVaccinations().add("Parvo");
		testMethods.getVaccinations().add("Distemper");
		
		assertEquals("Incorrect String returned from listVaccintations", "Rabies, Parvo, Distemper" , testMethods.listVaccinations());
	}

}
