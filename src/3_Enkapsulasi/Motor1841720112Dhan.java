/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MotorEncapsulation1841720112Dhan;

/**
 *
 * @author Wildhan Juniar
 */
public class Motor1841720112Dhan {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesinDhan() {
        kontakOn = true;
    }
    
    public void matikanMesinDhan() {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatanDhan() {
        if (kontakOn) {
            if (kontakOn  && kecepatan < 100) {
                kecepatan += 5;
            }
            else {
                System.out.println("Anda telah mencapai Kecepatan Maksimal! \n");
            }
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatanDhan() {
        if (kontakOn) {
            kecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa dikurangi karenga Mesin Off! \n");
        }
    }
    
    public void printStatusDhan() {
        if (kontakOn) {
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}