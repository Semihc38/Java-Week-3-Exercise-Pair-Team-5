package com.techelevator.crm;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.techelevator.crm.Customer;

/***************************************************************
 * 
 * Create a `CustomerTests` class in the `com.techelevator.crm` package.
 *  Create a test for `getBalanceDue`.
 * 
 ***************************************************************/

public class CustomerTest {
	
	Customer costumer=new Customer("Semih", "Cetin");
	
	@Test
	public void test() {
		Map<String,Double>map=new HashMap<>();
		map.put("Grooming", 50.99);
		map.put("Walking", 15.99);
		map.put("Sitting", 5.99);

		double expectedPrice=50.99 + 15.99 + 5.99;
		
		assertEquals(expectedPrice,costumer.getBalanceDue(map),0.0);
	}

}
