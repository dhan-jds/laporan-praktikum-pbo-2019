/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author Wildhan Juniar
 */
public class Karyawan1841720112Dhan {

    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    
    public void setNamaDhan(String nama) {
        this.nama = nama;
    }
    
    public void setNipDhan(String nip) {
        this.nip = nip;
    }
    
    public void setGolonganDhan(String golongan) {
        this.golongan = golongan;
        switch (golongan.charAt(0)) {
            case '1' : this.gaji = 5000000;
            break;
            case '2' : this.gaji = 3000000;
            break;
            case '3' : this.gaji = 2000000;
            break;
            case '4' : this.gaji = 1000000;
            break;
            case '5' : this.gaji = 750000;
            break;
        }
    }
    
    public void setGajiDhan(double gaji) {
        this.gaji = gaji;
    }
    
    public String getNamaDhan() {
        return nama;
    }
    
    public String getNipDhan() {
        return nip;
    }
    
    public String getGolonganDhan() {
        return golongan;
    }
    
    public double getGajiDhan() {
        return gaji;
    }
}