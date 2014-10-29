package com.packet.MobilePhones;

/**
 * Created by Mihai on 10/29/2014.
 * This is the abstract class from which
 * other phone classes are inherited
 */
public abstract class Mobile {

    private String mName;
    private String mModel;
    private boolean power_ON;
    private boolean is_connected_to_mobile_network;

    protected Mobile(String mName, String mModel, boolean power_ON, boolean is_connected_to_mobile_network) {
        this.mName = mName;
        this.mModel = mModel;
        this.power_ON = power_ON;
        this.is_connected_to_mobile_network = is_connected_to_mobile_network;
    }

    public String get_mName() {
        return mName;
    }

    public void set_mName(String mName) {
        this.mName = mName;
    }

    public String get_mModel() {
        return mModel;
    }

    public void set_mModel(String mModel) {
        this.mModel = mModel;
    }

    public boolean isPower_ON() {
        return power_ON;
    }

    public void set_Power_ON(boolean power_ON) {
        this.power_ON = power_ON;
    }

    public boolean isIs_connected_to_mobile_network() {
        return is_connected_to_mobile_network;
    }

    public void set_Is_connected_to_mobile_network(boolean is_connected_to_mobile_network) {
        this.is_connected_to_mobile_network = is_connected_to_mobile_network;
    }
}