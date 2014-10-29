package com.packet.Interfaces;

import com.packet.Exceptions.MobileException;

/**
 * Created by Mihai on 10/29/2014.
 * The Interface for mobile phones.
 * It includes methods which require energy consumption. They automatically call the "consumeBattery()" method from "Mobile" Class.
 */
public interface IPhone {


    /**
     * tries to call a contact from the phone's primary contact list.
     *
     * @param contactName the name of the contact who is called
     * @throws MobileException if the mobile is powered off, has low battery or the contact is not found in the primary contact list.
     */
    public void callContact(String contactName) throws MobileException;

    /**
     * tries to send a message a contact from the phone's primary contact list.
     *
     * @param contactName the name of the contact who is called
     * @throws MobileException if the mobile is powered off, has low battery or the contact is not found in the primary contact list.
     */
    public void sendMessage(String contactName) throws MobileException;

    /**
     * checks is the mobile phone has a wireless connection adaptor.
     *
     * @return <code>True</code> if the mobile has a wireless connection adaptor, <code>False</code> otherwise.
     */
    public boolean testForWirelessConnection();

    /**
     * tries to check if the number of a contact from the phone's primary contact list is available.
     *
     * @param contactName the name of the contact who is called
     * @throws MobileException if the mobile is powered off, has low battery or the contact is not found in the primary contact list.
     */
    public int printContactNumber(String contactName) throws MobileException;

}
