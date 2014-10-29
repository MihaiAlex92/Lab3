package Main;

import com.packet.Exceptions.MobileException;
import com.packet.MobilePhones.HTC;
import com.packet.MobilePhones.Nokia;

/**
 * Created by Mihai Dumitrel, E214A on 10/29/2014.
 * This is the Main class used for my homework
 * Software Engineering Course: Homework Nr. 3
 * Chosen topic: Mobile Phones
 */
public class Main {


    /**
     * The main class of the program
     * use "ctrl+alt+l" identation and spacing
     */
    public static void main(String[] args) throws MobileException {

        HTC mobil_htc = new HTC("HTC", "Desire", true, true);
        Nokia mobil_nokia = new Nokia("Nokia", "N650", true, false);

        // if(mobil.isPower_ON())
        //   System.out.println("The mobile is powered on!");

        //for (int i = 0; i < 6; i++)
        // mobil_htc.consumeBattery();


        try {
            mobil_htc.callContact("Iulian");
            mobil_htc.getMobileInfo();
            mobil_htc.printContactNumber("Mihai");
            mobil_nokia.getMobileInfo();
            mobil_nokia.testForWirelessConnection();
            mobil_htc.testForWirelessConnection();
            mobil_htc.chargeBattery();
            mobil_nokia.chargeBattery();
            mobil_htc.sendMessage("Politia");
            mobil_htc.callContact("Salvare");
            mobil_htc.set_Power_ON(false);
            mobil_htc.printContactNumber("Giulia");
            mobil_htc.set_Power_ON(true);
            mobil_htc.printContactNumber("Giulia");
            mobil_htc.callContact("Ajutor");
            mobil_htc.callContact("Mirel");
            mobil_htc.chargeBattery();
            mobil_htc.chargeBattery();
            mobil_htc.set_Power_ON(true);
            mobil_htc.callContact("Ajutor");
            mobil_htc.callContact("Mirel");
            mobil_nokia.sendMessage("Politia");
            mobil_nokia.callContact("Salvare"); //
            mobil_nokia.set_Power_ON(false);
            mobil_nokia.printContactNumber("Giulia");
            mobil_nokia.set_Power_ON(true);
            mobil_nokia.printContactNumber("Giulia");
            mobil_nokia.callContact("Ajutor");
            mobil_nokia.callContact("Mirel");
            mobil_htc.chargeBattery();
            mobil_htc.chargeBattery();
            mobil_htc.set_Power_ON(true);
            mobil_nokia.callContact("Ajutor");
            mobil_nokia.callContact("Mirel");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


