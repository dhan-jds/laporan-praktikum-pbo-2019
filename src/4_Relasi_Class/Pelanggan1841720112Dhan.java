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
public class Pelanggan1841720112Dhan {

    public Pelanggan1841720112Dhan() {
    }
    
    private String nama;
    private Mobil1841720112Dhan mobil;
    private Sopir1841720112Dhan sopir;
    private int hari;
    
    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public void setMobilDhan(Mobil1841720112Dhan mobil) {
        this.mobil = mobil;
    }

    public Mobil1841720112Dhan getMobilDhan() {
        return mobil;
    }
    public void setSopirDhan(Sopir1841720112Dhan sopir) {
        this.sopir = sopir;
    }

    public Sopir1841720112Dhan getSopirDhan() {
        return sopir;
    }
    public void setHariDhan(int hari) {
        this.hari = hari;
    }

    public int getHariDhan() {
        return hari;
    }

    public int hitungBiayaTotalDhan() {
        return mobil.hitungBiayaMobilDhan(hari) + sopir.hitungBiayaSopirDhan(hari);
    }
}