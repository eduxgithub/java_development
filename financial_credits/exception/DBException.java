package com.everis.financial.exception;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

public class DBException extends Exception {
	
	 /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(DBException.class);

    /**
     * DBException constructor vac�o
     */
    public DBException() {
        super();
    }

    /**
     * DBException constructor con mensaje de la excepci�n
     * @param msg String mensaje de la excepci�n
     */
    public DBException(String msg) {
        super(msg);
    }

    /**
     * DBException constructor con Error
     * @param cause Throwable error
     */
    public DBException(Throwable cause) {
        super(cause);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
