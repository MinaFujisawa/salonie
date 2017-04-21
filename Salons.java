/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.util.ArrayList;

/**
 *
 * @author MinaFujisawa
 */
public class Salons implements Favorable {

    //static SalonsInfo[] salonList;
    protected boolean favod = false;
    protected int salonNum;
    ArrayList<SalonsInfo> salonList = new ArrayList<>();

    public Salons() {

        salonList.add(new HairSalon(salonNum, "Zeal hair", "568 Robson St, Vancouver, BC V6B 2B7", 55, favod, 4, 45, false));
        salonList.add(new HairSalon(salonNum, "Citrus Hair Salon", "1036 Mainland St, Vancouver, BC V6B 2T4", 80, favod, 5, 50, true));
        salonList.add(new HairSalon(salonNum, "Chura Hair Salon", "118 Keefer Pl, Vancouver, BC V6B 0J1", 30, favod, 3, 40, false));
        salonList.add(new HairSalon(salonNum, "Chura Primo", "338 W Pender St, Vancouver, BC V6B 1T1", 42, favod, 4, 23, false));
//        salonList.add(new HairSalon(salonNum,"Lure Salon", "840 Howe St #170, Vancouver, BC V6Z 2S9", 35,favod, 5, 44, true));
//        salonList.add(new HairSalon(salonNum,"Poppy Hair Salon", "2686 W 4th Ave, Vancouver, BC V6K 1P7", 60,favod, 2, 38, true));
//        salonList.add(new HairSalon(salonNum,"Misako Hair Salon", "888 Davie St, Vancouver, BC V6Z 2S2", 50,favod, 5, 56, false));
//        salonList.add(new HairSalon(salonNum,"WorkShop Salon", " 522 Beatty St, Vancouver, BC V6B 2L3", 21,favod, 4, 66, true));
//        salonList.add(new HairSalon(salonNum,"Bangtown Hair Salon", "438 W Pender St, Vancouver, BC V6B 1T5", 15,favod, 3, 31, true));
//        salonList.add(new HairSalon(salonNum,"Cutting Club Hair Salon", "555 W Hastings St, Vancouver, BC V6B 4N5",60,favod, 1, 12, false));

        salonList.add(new NailSalon(salonNum, "Pure Nail Bar", "1030 W Georgia St, Vancouver, BC V6C 2L1", 40, favod, 4, 50));
        salonList.add(new NailSalon(salonNum, "Minoko", "1253 Granville St, Vancouver, BC V6Z 1M5", 90, favod, 3, 44));
        salonList.add(new NailSalon(salonNum, "Pure Nail Bar", "1780 Manitoba St, Vancouver, BC V5Y 1H9", 30, favod, 5, 32));
        salonList.add(new NailSalon(salonNum, "THE Salon Beauty Bar", "505 Thurlow St, Vancouver, BC V6E 4J6", 50, favod, 3, 20));
        salonList.add(new NailSalon(salonNum, "Chichi Nails", "1260 W Pender St, Vancouver, BC V6E 2S8", 60, favod, 2, 15));
        salonList.add(new NailSalon(salonNum, "Frilly Lilly", "1076 Hamilton St, Vancouver, BC V6B 2R9", 40, favod, 5, 56));
//        salonList.add(new NailSalon(salonNum,"Crescent Nail and Spa", "1066 W Broadway, Vancouver, BC V6H 1E7", 50,favod, 4, 67));
//        salonList.add(new NailSalon(salonNum,"Glamstar Beauty & Nails", "1833 Anderson St, Vancouver, BC V6H 4E5", 10,favod, 3, 54));
//        salonList.add(new NailSalon(salonNum,"Ari Beauty Nail", "930 Cambie St, Vancouver, BC V6B 5X6", 20,favod, 3, 33));
//        salonList.add(new NailSalon(salonNum,"Posy Nail & Spa", "1228 Homer St, Vancouver, BC V6B 2Y5", 60, favod, 4, 21));
//        
        // sets salonNum
        for (int i = 0; i < salonList.size(); i++) {
            salonList.get(i).salonNum = i + 1;
        }

    }

    public void output() {

        for (int i = 0; i < salonList.size(); i++) {
            System.out.println(salonList.get(i));
            System.out.println("---------------------------------------");
        }
    }

    @Override
    public void favo(int getSalonNum, boolean favo) {

        for (int i = 0; i < salonList.size(); i++) {
            if (salonList.get(i).salonNum == getSalonNum) {
                if (favo) {
                    salonList.get(i).favod = true;
                    System.out.println("Favorite added");
                } else {
                    salonList.get(i).favod = false;
                    System.out.println("Favorite removed");
                }
            }
        }

    }

}
