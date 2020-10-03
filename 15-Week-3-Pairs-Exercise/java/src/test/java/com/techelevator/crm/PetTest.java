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
		assertEquals("Incorrect String returned from listVaccintations", "Rabies, Distemper, Parvo", testMethods.listVaccinations());
	}

}
