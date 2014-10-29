package com.packet.Utils;

/**
 * Created by Mihai on 10/29/2014.
 * A class which defines several constants for the program
 * It contains constant values which are used in functions;
 * It also contains Exception messages based on the type of event
 * which triggers the respective Exception;
 */
public class Constants {

    public static final String EX_MSG_POWERED_OFF = "EXCEPTION: THE DEVICE IS TURNED OFF! PLEASE START THE PHONE AND RECHARGE THE BATTERY!";
    public static final String EX_MSG_CONTACT_NAME = "EXCEPTION: THE SPECIFIED CONTACT DOES NOT EXIST IN THE PHONE'S AGENDA!";
    public static final String EX_MSG_BATTERY_LEVEL = "EXCEPTION: THE CURRENT LEVEL OF BATTERY DOES NOT ALLOW THE REQUESTED OPERATION TO PERFORM.";

    public static final String WIRELESS_CONNECTION_OFF = "This phone does not have a wireless connection adaptor.";
    public static final String SUCCES_CALL_HTC = "The following contact has been called from a HTC: ";
    public static final String SUCCES_CALL_NOKIA = "The following contact has been called from a Nokia: ";
    public static final String SUCCES_MESSAGE = "The following contact has been messaged: ";
    public static final String SUCCES_PHONE_NUMBER = "The following contact has a valid phone number: ";


    public static final int BATTERY_CHARGE_VALUE = 17;
    public static final int BATTERY_HTC_DISCHARGE_VALUE = 15;
    public static final int BATTERY_NOKIA_DISCHARGE_VALUE = 7;

    public static final int GENERAL_ERROR_VALUE = -1284;
    public static final int SUCCES_VALUE = 0;

}
