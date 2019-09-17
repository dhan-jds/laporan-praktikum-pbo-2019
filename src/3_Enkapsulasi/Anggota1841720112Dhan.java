/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter1841720112dhan;

/**
 *
 * @author Wildhan Juniar
 */
public class Anggota1841720112Dhan {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720112Dhan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNamaDhan(String nama) {
        this.nama = nama;
    }
    
    public void setAlamatDhan(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNamaDhan() {
        return nama;
    }
    
    public String getAlamatDhan() {
        return alamat;
    }
    
    public float getSimpananDhan() {
        return simpanan;
    }
    
    public void setorDhan(float uang) {
        simpanan += uang;
    }
    
    public void pinjamDhan(float uang) {
        simpanan -= uang;
    }
}