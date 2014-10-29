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

    }

    @Override
    public void sendMessage(String contactName) throws MobileException {

    }

    @Override
    public boolean testForWirelessConnection() {
        return false;
    }

    @Override
    public int printContactNumber(String contactName) throws MobileException {
        return 0;
    }


    @Override
    public void getMobileInfo() {
        System.out.println("INFORMATION ABOUT THIS MOBILE DEVICE:");
        System.out.println("");
        System.out.println("Mobile Producer: " + this.get_mName());
        System.out.println("Model: " + this.get_mModel());
        String status = "";
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
    }

    @Override
    public void consumeBattery() {
        this.battery -=Constants.BATTERY_NOKIA_DISCHARGE_VALUE;
    }
}
