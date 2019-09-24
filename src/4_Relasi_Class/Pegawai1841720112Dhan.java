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
public class Pegawai1841720112Dhan {
    private String nip;
    private String nama;
    
    Pegawai1841720112Dhan(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public void setNipDhan(String nip){
        this.nip = nip;
    }
    public String getNipDhan(){
        return nip;
    }
    public void setNamaDhan(String nama){
        this.nama = nama;
    }
    public String getNamaDhan(){
        return nama;
    }
    public String infoDhan() { String info = " ";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
    }
}