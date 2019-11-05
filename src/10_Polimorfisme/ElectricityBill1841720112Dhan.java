/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;

/**
 *
 * @author Wildhan Juniar
 */
public class ElectricityBill1841720112Dhan implements Payable1841720112Dhan {

    private int kwh;
    private String category;

    public ElectricityBill1841720112Dhan(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhDhan() {
        return kwh;
    }

    public void setKwhDhan(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryDhan() {
        return category;
    }

    public void setcategoryDhan(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountDhan() {
        return kwh * getBasePriceDhan();
    }

    public int getBasePriceDhan() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    public String getBillInfoDhan() {
        return "kWH = " + kwh + "\n" + "Category = " + category + "(" + getBasePriceDhan()+ " per kWH)\n";
    }
}