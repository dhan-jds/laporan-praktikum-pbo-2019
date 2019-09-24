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
public class Kasir1841720112Dhan {

    private Sewa1841720112Dhan sewa;
    private int id;
    private String nama, jenisKelamin;

    Kasir1841720112Dhan() {

    }

    Kasir1841720112Dhan(int id, String nama, String jenisKelamin) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;

    }

    public void setSewaDhan(Sewa1841720112Dhan sewa) {
        this.sewa = sewa;
    }

    public Sewa1841720112Dhan sewaDhan() {
        return sewa;
    }

    public void setIdDhan(int id) {
        this.id = id;
    }

    public int idDhan() {
        return id;
    }

    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public void setJenisKelaminDhan(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getjenisKelaminDhan() {
        return jenisKelamin;
    }

    public String infoDhan() {
        String info = "";
        info += "Id Kasir       : " + this.id + "\n";
        info += "Nama Kasir     : " + this.nama + "\n";
        info += "Jenis Kelamin  : " + this.jenisKelamin + "\n";
        return info;
    }
}