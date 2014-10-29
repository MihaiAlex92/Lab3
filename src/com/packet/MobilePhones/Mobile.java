package com.packet.MobilePhones;

import com.packet.Utils.Constants;

/**
 * Created by Mihai on 10/29/2014.
 * This is the abstract class from which
 * other phone classes are inherited
 */
public abstract class Mobile {

    protected int battery=100; /* The battery level of a mobile phone; it drops down by 10 when a method is called */
    private String mName; /* The name of the mobile phone producer */
    private String mModel; /*The model of the mobile phone */
    private boolean power_ON = false; /* state of the mobile phone to check if it is powered on/off */
    private boolean is_connected_to_mobile_network = false; /* state of the mobile phone to check if it is connected to a mobile phone network(eg. Vodafone)*/

    /**
     * Constructor used for initializing objects of a class which inherits the "Mobile" Class
     *
     * @param mName  The name of the mobile phone producer
     * @param mModel The model of the mobile phone
     */
    protected Mobile(String mName, String mModel) {
        this.mName = mName;
        this.mModel = mModel;
    }

    /**
     * Constructor used for initializing objects of a class which inherits the "Mobile" Class
     *
     * @param mName                          The name of the mobile phone producer
     * @param mModel                         The model of the mobile phone
     * @param power_ON                       state of the mobile phone to check if it is powered on/off
     * @param is_connected_to_mobile_network state of the mobile phone to check if it is connected to a mobile phone network
     */
    protected Mobile(String mName, String mModel, boolean power_ON, boolean is_connected_to_mobile_network) {
        this.mName = mName;
        this.mModel = mModel;
        this.power_ON = power_ON;
        this.is_connected_to_mobile_network = is_connected_to_mobile_network;
    }

    /**
     * Returns the name of the mobile phone producer
     *
     * @return <code>String</code>
     */
    public String get_mName() {
        return mName;
    }

    /**
     * Sets the name of a mobile phone producer
     *
     * @param mName the name of mobile phone producer;
     */
    public void set_mName(String mName) {
        this.mName = mName;
    }

    /**
     * returns the model of a mobile phone
     *
     * @return <code>String</code>
     */
    public String get_mModel() {
        return mModel;
    }

    /**
     * Sets the model of a mobile phone
     *
     * @param mModel the model of the mobile phone
     */
    public void set_mModel(String mModel) {
        this.mModel = mModel;
    }

    /**
     * Checks if a mobile phone is powered On/Off
     *
     * @return <code>True</code> for ON, <code>False</code> for OFF
     */
    public boolean isPower_ON() {
        return power_ON;
    }

    /**
     * sets the state of a mobile phone to On/Off
     *
     * @param power_ON bool value: <code>True</code> for ON/false for <code>False</code>
     */
    public void set_Power_ON(boolean power_ON) {
        this.power_ON = power_ON;
    }

    /**
     * Checks if a mobile phone is connected to a mobile phone network
     *
     * @return <code>True</code> for Connected, <code>False</code> for Disconnected
     */
    public boolean is_connected_to_mobile_network() {
        return is_connected_to_mobile_network;
    }

    /**
     * sets the connection state of a mobile phone to a phone network
     *
     * @param is_connected_to_mobile_network bool value: true for connected/false for disconnected
     */
    public void set_mobile_network(boolean is_connected_to_mobile_network) {
        this.is_connected_to_mobile_network = is_connected_to_mobile_network;
    }

    /**
     * Prints the detailed information of a phone device
     */
    public abstract void getMobileInfo();

    public abstract void consumeBattery();

    public void chargeBattery() {
        this.battery += Constants.BATTERY_CHARGE_VALUE;

    }

    public int getBattery() {
        return battery;
    }
}