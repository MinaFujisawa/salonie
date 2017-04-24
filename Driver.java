/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.Scanner;

/**
 *
 * @author MinaFujisawa
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Salons list = new Salons();
        SalonTypeSwitch test = new SalonTypeSwitch();

        

        System.out.println();

        
        // prompts the user to choose which salon type shows
        System.out.println("Pls choose salon's type. \n1. Hair Salon\n2. Nail Salon");
        int type = scan.nextInt();
        while (type != 1 && type != 2) {
            System.out.println("Pls enter 1 or 2");
            type = scan.nextInt();
        }
        
        // switchs display - HairSalon or NailSalon
        if (type == 1) {
            test.switchSalonType(HairSalon.class);
        } else if (type == 2) {
            test.switchSalonType(NailSalon.class);
        }
        
        //removes favorite
        list.favo(2, true);
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        list.output();
        
        //removes favorite
        System.out.println();
        System.out.println("=============================");
        System.out.println();
        //list.favo(1, false);
        list.output();
    }
}
