package Main;

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
    public static void main(String[] args) {

        HTC mobil = new HTC("Nokia", "N650", true, true);
        Nokia m = new Nokia("Asus","Tenda",true,false);
      // System.out.println(mobil.get_mName());
       // if(mobil.isPower_ON())
         //   System.out.println("The mobile is powered on!");


        mobil.getMobileInfo();
        mobil.consumeBattery();
        mobil.consumeBattery();
        mobil.getMobileInfo();
        mobil.chargeBattery();
        mobil.getMobileInfo();
       // m.getMobileInfo();

    }
}


