/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4;

/**
 *
 * @author Wildhan Juniar
 */
public class Mobil1841720112Dhan {

    private String merk;
    private int biaya;

    public Mobil1841720112Dhan() {
    }

    public String getMerkDhan() {
        return merk;
    }
    
    public void setMerkDhan(String merk) {
        this.merk = merk;
    }
    
    public int getBiayaDhan() {
        return biaya;
    }
    
    public void setBiayaDhan(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaMobilDhan(int hari) {
        return biaya * hari;
    }
}