package com.everis.financial.domain;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

//TODO: Auto-generated Javadoc

/**
 * The Class SalesRequest.
 */
public class SalesRequest {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(SalesRequest.class);

    /** The date. */
    private String date;

    /** The data car. */
    private Car dataCar;

    /** The data salesman. */
    private Salesman dataSalesman;

    /** The data client. */
    private Client dataClient;

    /**
     * Instantiates a new sales request.
     */
    public SalesRequest() {}

    /**
     * Gets the data client.
     *
     * @return the data client
     */
    public Client getDataClient() {
        return dataClient;
    }

    /**
     * Sets the data buyer.
     *
     * @param dataBuyer the new data buyer
     */
    public void setDataClient(Client dataClient) {
        this.dataClient = dataClient;
    }

    /**
     * Gets the data car.
     *
     * @return the data car
     */
    public Car getDataCar() {
        return dataCar;
    }

    /**
     * Sets the data car.
     *
     * @param dataCar the new data car
     */
    public void setDataCar(Car dataCar) {
        this.dataCar = dataCar;
    }

    /**
     * Gets the data salesman.
     *
     * @return the data salesman
     */
    public Salesman getDataSalesman() {
        return dataSalesman;
    }

    /**
     * Sets the data salesman.
     *
     * @param dataSalesman the new data salesman
     */
    public void setDataSalesman(Salesman dataSalesman) {
        this.dataSalesman = dataSalesman;
    }

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
}


//~ Formatted by Jindent --- http://www.jindent.com
