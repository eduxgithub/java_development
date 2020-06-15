package com.everis.financial.business;

import com.everis.financial.domain.Client;

import org.apache.log4j.Logger;

import com.everis.financial.domain.Car;
import com.everis.financial.domain.SalesRequest;
import com.everis.financial.domain.Salesman;
import com.everis.financial.wrapper.RunJobFinancialCredits;

public class JobFinancialCredits {
	
	private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(JobFinancialCredits.class);
    
    
    public JobFinancialCredits() {
    	
    }
    
    
    public SalesRequest getSalesRequest(Salesman salesman, Client client, Car car) {
        SalesRequest salesRequest = new SalesRequest();
        
        System.out.println("Vendedor - Id:" + salesman.getCode());
        System.out.println("Vendedor - Nombre:" + salesman.getFirstName());
        System.out.println("Vendedor - Apellido:" + salesman.getLastName());

        // TODO
        return salesRequest;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
