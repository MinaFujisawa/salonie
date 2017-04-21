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
       
        Scanner scan = new Scanner(System.in);
        Salons list = new Salons();
        SalonTypeSwitch test = new SalonTypeSwitch();
        
        //adds facorite
        list.favo(1, true);
        list.favo(1, false);
        
        System.out.println();
        
        //switchs display HairSalon or NailSalon
        System.out.println("Pls choose salon's type. \n1 Hair Salon\n2 Nail Salon");      
            int type = scan.nextInt();              
            while(type != 1 && type != 2){             
                System.out.println("Pls enter 1 or 2");
                type = scan.nextInt();
            }
            if (type == 1) {
                test.switchSalonType(HairSalon.class);
            } else if (type == 2) {
                test.switchSalonType(NailSalon.class);
            }                       
    }
}
