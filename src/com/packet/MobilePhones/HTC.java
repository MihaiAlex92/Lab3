package com.packet.MobilePhones;

import com.packet.Exceptions.MobileException;
import com.packet.Interfaces.IPhone;
import com.packet.Utils.Constants;

/**
 * Created by Mihai on 10/29/2014.
 * A mobile class inherited from the abstract class "Mobile"
 * This class represents the features and characteristics
 * of HTC phones
 */
public class HTC extends Mobile implements IPhone {


    private static boolean hasWireless = true; /* used to state if the mobile has wireless network adaptor*/

    /**
     * Constructer used for a "HTC" class object which initializes all members
     *
     * @param mName                          The name of the mobile phone producer
     * @param mModel                         The model of the mobile phone
     * @param power_ON                       State of the mobile phone to check if it is powered on/off
     * @param is_connected_to_mobile_network State of the mobile phone to check if it is connected to a mobile phone network
     */
    public HTC(String mName, String mModel, boolean power_ON, boolean is_connected_to_mobile_network) {
        super(mName, mModel, power_ON, is_connected_to_mobile_network);
    }


    @Override
    public void getMobileInfo() throws MobileException {

        this.testForMobileException();


        this.consumeBattery();
        System.out.println("INFORMATION ABOUT THIS MOBILE DEVICE:");
        System.out.println("");
        System.out.println("Mobile Producer: " + this.getMobileName());
        System.out.println("Model: " + this.getMobileModel());
        String status;
        if (this.isPowerON())
            status = "ON";
        else
            status = "OFF";
        System.out.println("Power Status: " + status);

        if (this.isConnectedToMobileNetwork())
            status = "CONNECTED";
        else
            status = "NOT CONNECTED";
        System.out.println("Phone Connection Status: " + status);
        System.out.println("Battery Level: " + this.getBattery());

    }

    @Override
    protected void consumeBattery() {
        this.battery -= Constants.BATTERY_HTC_DISCHARGE_VALUE;
        if (this.battery <= 0)
            setPowerON(false);
    }

    @Override
    public void callContact(String contactName) throws MobileException {

        this.testForMobileException();


        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }

        if (!contactExists)
            throw new MobileException(Constants.EX_MSG_CONTACT_NAME);

        this.consumeBattery();
        System.out.println(Constants.SUCCES_CALL_HTC + contactName);


    }

    @Override
    public void sendMessage(String contactName) throws MobileException {

        this.testForMobileException();


        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }

        if (!contactExists)
            throw new MobileException(Constants.EX_MSG_CONTACT_NAME);

        this.consumeBattery();
        System.out.println(Constants.SUCCES_MESSAGE + contactName);

    }

    @Override
    public boolean testForWirelessConnection() {
        return this.hasWireless;
    }

    @Override
    public int printContactNumber(String contactName) throws MobileException {

        this.testForMobileException();


        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }


        if (!contactExists) {
            System.out.println(Constants.ERROR_CONTACT_NAME);
            return Constants.GENERAL_ERROR_VALUE;
        }

        System.out.println(Constants.SUCCES_PHONE_NUMBER + contactName);
        this.consumeBattery();
        return Constants.SUCCES_VALUE;
    }

    @Override
    public void testForMobileException() throws MobileException {

        if (!this.isPowerON())
            throw new MobileException(Constants.EX_MSG_POWERED_OFF);

        if (this.battery - Constants.BATTERY_HTC_DISCHARGE_VALUE < 0)
            throw new MobileException(Constants.EX_MSG_BATTERY_LEVEL);
    }
}
