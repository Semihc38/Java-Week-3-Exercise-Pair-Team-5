package com.techelevator;

import java.util.Map;

/***************************************************************
 * Complete interface
 ***************************************************************/

public interface Billable {

    double getBalanceDue(Map<String, Double> servicesRendered);
    

}
