/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author MinaFujisawa
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salons list = new Salons();
        SalonTypeSwitch test = new SalonTypeSwitch();
        
        //adds facorite
        list.favo(1, true);
        list.favo(1, false);
        
        System.out.println();
        
        //switchs display - HairSalon or NailSalon
        test.switchSalonType(HairSalon.class);
    }
}
