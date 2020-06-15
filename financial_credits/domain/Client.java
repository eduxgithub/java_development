package com.everis.financial.domain;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

//TODO: Auto-generated Javadoc

/**
 * The Class Buyer.
 */
public class Client {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(Client.class);

    /** The rut. */
    private String rut;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The address. */
    private String address;

    /** The birth date. */
    private String birthDate;

    /** The nationality. */
    private String nationality;

    /** The phone number. */
    private String phoneNumber;

    /** The job. */
    private String job;

    /**
     * Instantiates a new buyer.
     */
    public Client() {}

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the birth date.
     *
     * @return the birth date
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birth date.
     *
     * @param birthDate the new birth date
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the job.
     *
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * Sets the job.
     *
     * @param job the new job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the nationality.
     *
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality.
     *
     * @param nationality the new nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
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
}


//~ Formatted by Jindent --- http://www.jindent.com
