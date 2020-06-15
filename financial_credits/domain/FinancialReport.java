package com.everis.financial.domain;

import java.util.List;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

//TODO: Auto-generated Javadoc

/**
 * The Class FinancialReport.
 */
public class FinancialReport {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(FinancialReport.class);

    /** The date. */
    private String date;

    /** The list sales request. */
    private List listSalesRequest;

    /** The path image logo. */
    private String pathImageLogo;

    /**
     * Instantiates a new financial report.
     */
    public FinancialReport() {}

    /**
     * Gets the date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date.
     *
     * @param date the new date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the list sales request.
     *
     * @return the list sales request
     */
    public List getListSalesRequest() {
        return listSalesRequest;
    }

    /**
     * Sets the list sales request.
     *
     * @param listSalesRequest the new list sales request
     */
    public void setListSalesRequest(List listSalesRequest) {
        this.listSalesRequest = listSalesRequest;
    }

    /**
     * Gets the path image logo.
     *
     * @return the path image logo
     */
    public String getPathImageLogo() {
        return pathImageLogo;
    }

    /**
     * Sets the path image logo.
     *
     * @param pathImageLogo the new path image logo
     */
    public void setPathImageLogo(String pathImageLogo) {
        this.pathImageLogo = pathImageLogo;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
