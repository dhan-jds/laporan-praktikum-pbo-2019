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
public class Customer1841720112Dhan {

    private int id;
    private Kasir1841720112Dhan kasir;
    private String nama;
    private String umur;

    Customer1841720112Dhan() {
    }

    Customer1841720112Dhan(int id, String nama, String umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public void setIdDhan(int id) {
        this.id = id;
    }

    public int getIdDhan() {
        return id;
    }

    public void setKasirDhan(Kasir1841720112Dhan kasir) {
        this.kasir = kasir;
    }

    public Kasir1841720112Dhan getKasirDhan() {
        return kasir;
    }

    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public void setUmurDhan(String umur) {
        this.umur = umur;
    }

    public String getUmurDhan() {
        return umur;
    }

    public String infoDhan() {
        String info = "";
        info += "Id Customer     : " + this.id + "\n";
        info += "Nama Customer   : " + this.nama + "\n";
        info += "Umur Customer   : " + this.umur + "\n";
        return info;
    }
}