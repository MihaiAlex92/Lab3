package com.packet.Utils;

/**
 * Created by Mihai on 10/29/2014.
 * A class which defines several constants for the program
 * It contains constant returning values for functions;
 * It also contains Exception messages based on the type of event
 * which triggers the respective Exception;
 */
public class Constants {

    public static final String EX_MSG_SEND_TEXT = "TEXT MESSAGE COULD NOT BE SENT!";
    public static final String EX_MSG_CONTACT_NAME = "THE SPECIFIED CONTACT DOES NOT EXIST IN AGENDA!";
    public static final String EX_MSG_CALL = "THE CONTACT COULD NOT BE REACHED!";
    public static final int RET_VAL_NO_ERR = 0;
    public static final int RET_VAL_ERR_INIT = 1024;
    public static final int BATTERY_CHARGE_VALUE = 5;
    public static final int BATTERY_HTC_DISCHARGE_VALUE = 10;
    public static final int BATTERY_NOKIA_DISCHARGE_VALUE = 5;

}
