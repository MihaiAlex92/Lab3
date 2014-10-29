package com.packet.MobilePhones;

import com.packet.Exceptions.MobileException;
import com.packet.Interfaces.IPhone;
import com.packet.Utils.Constants;

/**
 * Created by Mihai on 10/29/2014.
 * A mobile class inherited from the abstract class "Mobile"
 * This class represents the features and characteristics
 * of Nokia phones
 */
public class Nokia extends Mobile implements IPhone {


    /**
     * Constructer used for a "Nokia" class object which initializes all members
     *
     * @param mName                          The name of the mobile phone producer
     * @param mModel                         The model of the mobile phone
     * @param power_ON                       state of the mobile phone to check if it is powered on/off
     * @param is_connected_to_mobile_network state of the mobile phone to check if it is connected to a mobile phone network
     */
    public Nokia(String mName, String mModel, boolean power_ON, boolean is_connected_to_mobile_network) {
        super(mName, mModel, power_ON, is_connected_to_mobile_network);
    }

    @Override
    public void callContact(String contactName) throws MobileException {

        if (!isPower_ON())
            throw new MobileException(Constants.EX_MSG_POWERED_OFF);

        if (this.battery - Constants.BATTERY_NOKIA_DISCHARGE_VALUE < 0)
            throw new MobileException(Constants.EX_MSG_BATTERY_LEVEL);

        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }
        ///////////////////////////////////////////////////////////////////////////////

        if (!contactExists)
            throw new MobileException(Constants.EX_MSG_CONTACT_NAME);

        this.consumeBattery();
        System.out.println(Constants.SUCCES_CALL_NOKIA + contactName);

    }

    @Override
    public void sendMessage(String contactName) throws MobileException {

        if (!isPower_ON())
            throw new MobileException(Constants.EX_MSG_POWERED_OFF);

        if (this.battery - Constants.BATTERY_NOKIA_DISCHARGE_VALUE < 0)
            throw new MobileException(Constants.EX_MSG_BATTERY_LEVEL);

        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }
        ////////////////////////////////////////////////

        if (!contactExists)
            throw new MobileException(Constants.EX_MSG_CONTACT_NAME);

        this.consumeBattery();
        System.out.println(Constants.SUCCES_MESSAGE + contactName);


    }

    @Override
    public boolean testForWirelessConnection() {
        System.out.println(Constants.WIRELESS_CONNECTION_OFF);
        return false;
    }

    @Override
    public int printContactNumber(String contactName) throws MobileException {

        if (!isPower_ON())
            throw new MobileException(Constants.EX_MSG_POWERED_OFF);

        if (this.battery - Constants.BATTERY_NOKIA_DISCHARGE_VALUE < 0)
            throw new MobileException(Constants.EX_MSG_BATTERY_LEVEL);

        /* searching for the contact in the primary contact list of the mobile phone */
        boolean contactExists = false;
        for (String item : this.primaryContacts) {
            if (item.equals(contactName)) {
                contactExists = true;
                break;
            }

        }

        ////////////////////////////////////////////////////

        if (!contactExists) {
            System.out.println(Constants.EX_MSG_CONTACT_NAME);
            return Constants.GENERAL_ERROR_VALUE;
        }

        System.out.println(Constants.SUCCES_PHONE_NUMBER + contactName);
        this.consumeBattery();
        return Constants.SUCCES_VALUE;


    }


    @Override
    public void getMobileInfo() {
        System.out.println("INFORMATION ABOUT THIS MOBILE DEVICE:");
        System.out.println("");
        System.out.println("Mobile Producer: " + this.get_mName());
        System.out.println("Model: " + this.get_mModel());
        String status;
        if (this.isPower_ON())
            status = "ON";
        else
            status = "OFF";
        System.out.println("Power Status: " + status);

        if (this.is_connected_to_mobile_network())
            status = "CONNECTED";
        else
            status = "NOT CONNECTED";
        System.out.println("Phone Connection Status: " + status);
        System.out.println("Battery Level: " + this.getBattery());
        this.consumeBattery();
    }

    @Override
    protected void consumeBattery() {
        this.battery -= Constants.BATTERY_NOKIA_DISCHARGE_VALUE;
        if (this.battery <= 0)
            set_Power_ON(false);
    }
}
