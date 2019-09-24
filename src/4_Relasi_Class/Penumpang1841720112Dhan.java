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
public class Penumpang1841720112Dhan {
    private String ktp;
    private String nama;

    public Penumpang1841720112Dhan(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtpDhan(String ktp) {
        this.ktp = ktp;
    }

    public String getKtpDhan() {
        return ktp;
    }

    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public String infoDhan() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}