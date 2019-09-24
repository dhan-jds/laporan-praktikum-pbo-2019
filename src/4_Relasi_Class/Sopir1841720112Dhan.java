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
public class Sopir1841720112Dhan {

    private String nama;
    private int biaya;

    public Sopir1841720112Dhan() {
    }
    
    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public void setBiayaDhan(int biaya) {
        this.biaya = biaya;
    }

    public int getBiayaDhan() {
        return biaya;
    }

    public int hitungBiayaSopirDhan(int hari) {
        return biaya * hari;
    }
}