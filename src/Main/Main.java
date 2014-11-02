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
     * The Main function of the program.
     * This is where all methods and objects are applied.
     */
    public static void main(String[] args) throws MobileException {

        HTC mobil_htc = new HTC("HTC", "Desire", true, true);
        Nokia mobil_nokia = new Nokia("Nokia", "N650", true, false);


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
            mobil_htc.setPowerON(false);
            mobil_htc.printContactNumber("Giulia");// first exception: the device is turned off and cannot perform actions


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                mobil_htc.setPowerON(true);
                mobil_htc.printContactNumber("Giulia");
                mobil_htc.callContact("Ajutor");
                // mobil_htc.callContact("Mirel"); // second exception: contact does not exist
                mobil_htc.getMobileInfo();
                mobil_htc.getMobileInfo();
                // mobil_htc.callContact("Ajutor"); //third exception: battery level too low to perform this action;
                mobil_htc.chargeBattery();
                mobil_htc.chargeBattery();
                mobil_htc.setPowerON(true);
                mobil_htc.callContact("Ajutor");
                mobil_nokia.sendMessage("Politia");
                mobil_nokia.callContact("Salvare");
                mobil_nokia.setPowerON(false);
                // mobil_nokia.printContactNumber("Giulia"); //fourth exception: the device is turned off and cannot perform actions
                mobil_nokia.setPowerON(true);
                mobil_nokia.printContactNumber("Giulia");
                mobil_nokia.callContact("Ajutor");
                System.out.println("Sfarsit testare.");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


