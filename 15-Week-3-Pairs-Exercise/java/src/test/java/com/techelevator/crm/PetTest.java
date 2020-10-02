package com.techelevator.crm;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetTest {
	
	Pet testMethods = new Pet(null, null, null); // Instantiate an object with the methods to test

	@Test
	public void test_for_listVaccinations() {
		assertEquals("Incorrect String returned from listVaccintations", "Rabies, Distemper, Parvo", testMethods.listVaccinations());
	}

}
