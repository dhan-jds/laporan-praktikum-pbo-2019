/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Wildhan Juniar
 */
public class Sepeda1841720112Dhan {
    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerekDhan(String newValue) {
       merek = newValue;
    }
    
    public void gantiGearDhan(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatanDhan(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void remDhan(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatusDhan(){
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear : " + gear);
    }
}