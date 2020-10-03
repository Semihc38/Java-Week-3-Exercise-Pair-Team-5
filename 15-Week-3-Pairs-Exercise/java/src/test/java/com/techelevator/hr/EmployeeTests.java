package com.techelevator.hr;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/***************************************************************
 * 
 * You'll also need to add a test for `getBalanceDue`
 *  in the `EmployeeTests` class. Keep in mind the discount.
 * 
 ***************************************************************/

public class EmployeeTests {
	
	Employee testMethods = new Employee(null, null);

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }


    // You'll also need to add a test for `getBalanceDue` in the `EmployeeTests` class.
    // Keep in mind the discount.
    @Test
    public void getBalanceDue() {
    	Employee employee = new Employee("Alex","Test");

    	Map<String,Double>map=new HashMap<>();
    	map.put("Grooming", 50.50);
    	map.put("Walking", 18.00);
    	map.put("Sitting", 5.25);

    	double expectedPrice=50.50+(18.00/2)+5.25;
    	assertEquals(expectedPrice,employee.getBalanceDue(map),0.0);
    }
}
