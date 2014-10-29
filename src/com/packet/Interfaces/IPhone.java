package com.packet.Interfaces;

import com.packet.Exceptions.MobileException;

/**
 * Created by Mihai on 10/29/2014.
 */
public interface IPhone {

    public void callContact(String contactName) throws MobileException;

    public void sendMessage(String contactName) throws MobileException;

    public boolean testForWirelessConnection();

    public int printContactNumber(String contactName) throws MobileException;

}
