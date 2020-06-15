package com.everis.financial.exception;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

public class BusinessFinancialCreditsException extends Exception {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(BusinessFinancialCreditsException.class);

    /**
     * Instantiates a new business financial credits exception.
     */
    public BusinessFinancialCreditsException() {
        super();
    }

    public BusinessFinancialCreditsException(String msg) {
        super();
    }

    public BusinessFinancialCreditsException(String message, Throwable cause) {
        super();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
