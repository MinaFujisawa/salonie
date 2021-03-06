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
abstract public class SalonsInfo {

    private String star, dollLabel;
    protected String salonName, address;
    protected int salonNum, review, reviewNum;
    protected double price;
    protected boolean favod = false;

    public SalonsInfo(int salonNum, String salonName, String address, double price, boolean favo, int review, int reviewNum) {
        this.salonNum = salonNum;
        this.salonName = salonName;
        this.address = address;
        this.price = price;
        this.favod = favo;
        this.review = review;
        this.reviewNum = reviewNum;
    }

    private String dollLabel() {
        if (0 < price && price <= 20) {
            dollLabel = "$";
        } else if (20 < price && price <= 40) {
            dollLabel = "$$";
        } else if (40 < price && price <= 60) {
            dollLabel = "$$$";
        } else if (60 < price) {
            dollLabel = "$$$$";
        }
        return dollLabel;
    }

    private String star() {
        switch (review) {
            case 1:
                star = "★";
                break;
            case 2:
                star = "★★";
                break;
            case 3:
                star = "★★★";
                break;
            case 4:
                star = "★★★★";
                break;
            case 5:
                star = "★★★★★";
                break;
            default:
                star = "";
        }
        return star;
    }

    public String toString() {
        String result = "salon No. " + salonNum + "\n";
        result += "salon name : " + salonName + "\n";
        result += "price : " + dollLabel() + "\n";
        result += "address : " + address + "\n";
        result += "favorite : " + favod + "\n";
        result += star() + "\n";
        result += reviewNum + " Reviews";

        return result;
    }

}
