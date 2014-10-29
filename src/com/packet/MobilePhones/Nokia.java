package com.packet.MobilePhones;

import com.packet.Exceptions.MobileException;
import com.packet.Interfaces.IPhone;

/**
 * Created by Mihai on 10/29/2014.
 * A mobile class inherited from the abstract class "Mobile"
 * This class represents the features and characteristics
 * of Nokia phones
 */
public class Nokia extends Mobile implements IPhone {


    protected Nokia(String mName, String mModel, boolean power_ON, boolean is_connected_to_mobile_network) {
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
}
