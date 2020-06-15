package com.everis.financial.domain;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

//TODO: Auto-generated Javadoc

/**
 * The Class Car.
 */
public class Car {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(Car.class);

    /** The make. */
    private String make;

    /** The model. */
    private String model;

    /** The price. */
    private String price;

    /** The body type. */
    private String bodyType;

    /**
     * Instantiates a new car.
     */
    public Car() {}

    /**
     * Gets the body type.
     *
     * @return the body type
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Sets the body type.
     *
     * @param bodyType the new body type
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * Gets the make.
     *
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make.
     *
     * @param make the new make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model.
     *
     * @param model the new model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price the new price
     */
    public void setPrice(String price) {
        this.price = price;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
