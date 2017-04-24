/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

/**
 *
 * @author AKI
 */
public class SalonTypeSwitch {
    
    public void switchSalonType (Class salonType){
        Salons list = new Salons();
        for (int i = 0; i < list.salonList.size(); i++) {
            if (salonType.isInstance(list.salonList.get(i))) {
                System.out.println(list.salonList.get(i));
                System.out.println("---------------------------------------");
            }
        }
    }
}
