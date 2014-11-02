package com.packet.MobilePhones;

import com.packet.Exceptions.MobileException;
import com.packet.Utils.Constants;

/**
 * Created by Mihai on 10/29/2014.
 * This is the abstract class from which
 * other phone classes are inherited
 */
public abstract class Mobile {

    protected int battery = 100; /* The battery level of a mobile phone; it drops down when a method is called */
    protected String primaryContacts[] = {"Salvare", "Pompieri", "Politia", "Ajutor", "Iulian"}; /*A primary list of contacts each phone must have*/
    private String mName; /* The name of the mobile phone producer */
    private String mModel; /*The model of the mobile phone */
    private boolean powerON = false; /* state of the mobile phone to check if it is powered on/off */
    private boolean isConnectedToMobileNetwork = false; /* state of the mobile phone to check if it is connected to a mobile phone network(eg. Vodafone)*/

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
     * @param powerON                       state of the mobile phone to check if it is powered on/off
     * @param isConnectedToMobileNetwork state of the mobile phone to check if it is connected to a mobile phone network
     */
    protected Mobile(String mName, String mModel, boolean powerON , boolean isConnectedToMobileNetwork) {
        this.mName = mName;
        this.mModel = mModel;
        this.powerON = powerON ;
        this.isConnectedToMobileNetwork = isConnectedToMobileNetwork;
    }

    /**
     * Returns the name of the mobile phone producer
     *
     * @return <code>String</code>
     */
    public String getMobileName() {
        return mName;
    }

    /**
     * Sets the name of a mobile phone producer
     *
     * @param mName the name of mobile phone producer;
     */
    public void setMobileName(String mName) {
        this.mName = mName;
    }

    /**
     * returns the model of a mobile phone
     *
     * @return <code>String</code>
     */
    public String getMobileModel() {
        return mModel;
    }

    /**
     * Sets the model of a mobile phone
     *
     * @param mModel the model of the mobile phone
     */
    public void setMobileModel(String mModel) {
        this.mModel = mModel;
    }

    /**
     * Checks if a mobile phone is powered On/Off
     *
     * @return <code>True</code> for ON, <code>False</code> for OFF
     */
    public boolean isPowerON () {
        return powerON ;
    }

    /**
     * sets the state of a mobile phone to On/Off
     *
     * @param powerON  bool value: <code>True</code> for ON/false for <code>False</code>
     */
    public void setPowerON (boolean powerON ) {
        this.powerON  = powerON ;
    }

    /**
     * Checks if a mobile phone is connected to a mobile phone network
     *
     * @return <code>True</code> for Connected, <code>False</code> for Disconnected
     */
    public boolean isConnectedToMobileNetwork() {
        return isConnectedToMobileNetwork;
    }

    /**
     * sets the connection state of a mobile phone to a phone network
     *
     * @param isConnectedToMobileNetwork bool value: true for connected/false for disconnected
     */
    public void setMobileNetwork(boolean isConnectedToMobileNetwork) {
        this.isConnectedToMobileNetwork = isConnectedToMobileNetwork;
    }

    /**
     * Prints the detailed information of a phone device
     */
    public abstract void getMobileInfo() throws MobileException;

    /**
     * called inside the interface methods in order to simulate the consumption of the battery power level.
     */
    protected abstract void consumeBattery();

    /**
     * charges the battery of a mobile phone device by incrementing its' battery level.
     */
    public void chargeBattery() {
        this.battery += Constants.BATTERY_CHARGE_VALUE;

    }

    /**
     * returns the current value of the battery level of a phone device
     *
     * @return <code>int</code>
     */
    public int getBattery() {
        return battery;
    }



}