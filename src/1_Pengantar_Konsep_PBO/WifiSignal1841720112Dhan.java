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
public class WifiSignal1841720112Dhan {
    private String merek;
    private int jumlahSignal;
    private int kecepatan;
    
    public void setMerekDhan(String newValue) {   
       merek = newValue;
    }
    
    public void gantiJumlahSignalDhan(int newValue){
        jumlahSignal = newValue;
    }
    
    public void fastDhan(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void slowDhan(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatusDhan(){
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Jumlah Signal : " + jumlahSignal);
    }
}