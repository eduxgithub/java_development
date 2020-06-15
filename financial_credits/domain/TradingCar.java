package com.everis.financial.domain;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

//TODO: Auto-generated Javadoc

/**
 * The Class TradingCar.
 */
public class TradingCar {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(TradingCar.class);

    /** The rut. */
    private String rut;

    /** The trading name. */
    private String tradingName;

    /** The fantasy name. */
    private String fantasyName;

    /** The adress. */
    private String adress;

    /** The email. */
    private String email;

    /** The phone number. */
    private String phoneNumber;

    /**
     * Instantiates a new trading car.
     */
    public TradingCar() {}

    /**
     * Gets the adress.
     *
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the adress.
     *
     * @param adress the new adress
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the fantasy name.
     *
     * @return the fantasy name
     */
    public String getFantasyName() {
        return fantasyName;
    }

    /**
     * Sets the fantasy name.
     *
     * @param fantasyName the new fantasy name
     */
    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    /**
     * Gets the phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     *
     * @param phoneNumber the new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the rut.
     *
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * Sets the rut.
     *
     * @param rut the new rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Gets the trading name.
     *
     * @return the trading name
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the trading name.
     *
     * @param tradingName the new trading name
     */
    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
