package com.everis.financial.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import com.everis.financial.wrapper.RunJobFinancialCredits;

public class Util {

    /**
     * logger logging de la clase Util
     */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER = Logger.getLogger(RunJobFinancialCredits.class);

    /**
     * Util
     */
    public Util() {
        super();
    }

    /**
     * transformPatternDate transforma el patrón de una fecha
     *
     * @param patternInitial String patrón de fecha inicial
     * @param patternReplace String patrón de fecha final
     * @param datePattern String fecha actual - definida mediante el patrón
     * inicial
     * @return String fecha formateada de acuerdo al patrón final
     */
    public static String transformPatternDate(String patternInitial, String patternReplace, String datePattern) {
        SimpleDateFormat sdf         = new SimpleDateFormat(patternInitial);
        String           dateReplace = null;
        Date             date        = null;

        try {
            date = sdf.parse(datePattern);
            sdf.applyPattern(patternReplace);
            dateReplace = sdf.format(date);
        } catch (ParseException ex) {
            LOGGER.error("Error: Parse Date. patternInitial: " + patternInitial + "/ patternReplace: " + patternReplace
                         + "/ datePattern: " + datePattern);
            LOGGER.error("Error de Parseo. Causa: " + Util.getStackTrace(ex));
            dateReplace = datePattern;
        }

        return dateReplace;
    }

    /**
     * getDate
     *
     * @param date Date
     * @param dateFormat String
     * @param postDay int
     * @return Date
     */
    public static Date getDate(Date date, String dateFormat, int postDay) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        sdf.format(date);

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + postDay);

        return calendar.getTime();
    }

    /**
     * getPostDate
     *
     * @return String
     */
    public static String getPostDate(String dateFormatted, String patternDate, int postDay) {
        SimpleDateFormat sdf  = new SimpleDateFormat(patternDate);
        Date             date = null;

        try {
            date = sdf.parse(dateFormatted);
        } catch (ParseException ex) {
            LOGGER.error("Error de Parseo. Causa: " + Util.getStackTrace(ex));
        }

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + postDay);

        SimpleDateFormat datePostFormatted = new SimpleDateFormat(patternDate);

        return datePostFormatted.format(calendar.getTime());
    }

    /**
     * getPreDate
     *
     * @param dateFormatted String
     * @param patternDate String
     * @param postDay int
     * @return String
     */
    public static String getPreDate(String dateFormatted, String patternDate, int preDay) {
        SimpleDateFormat sdf  = new SimpleDateFormat(patternDate);
        Date             date = null;

        try {
            date = sdf.parse(dateFormatted);
        } catch (ParseException ex) {
            LOGGER.error("Error de Parseo. Causa: " + Util.getStackTrace(ex));
        }

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - preDay);

        SimpleDateFormat datePostFormatted = new SimpleDateFormat(patternDate);

        return datePostFormatted.format(calendar.getTime());
    }

    /**
     * getStackTrace
     *
     * @param t Throwable
     * @return String
     */
    public static String getStackTrace(Throwable t) {
        String stackTrace = null;

        try {
            StringWriter sw = new StringWriter();
            PrintWriter  pw = new PrintWriter(sw);

            t.printStackTrace(pw);
            pw.close();
            sw.close();
            stackTrace = sw.getBuffer().toString();
        } catch (Exception ex) {}

        return stackTrace;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
