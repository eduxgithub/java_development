package com.everis.financial.persistence;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

public class ProcessDB implements ConnectionDB{
	
    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(ProcessDB.class);
    
	public String openSession(String username, String password, String dataBase, String url) {
		
		//TODO
		return "";
		
	}
	
	public String openSession(String username, String password, String dataBase) {
		
		//TODO
		return "";
		
	}
	
	public void closeSession() {
		
	}
		
}
