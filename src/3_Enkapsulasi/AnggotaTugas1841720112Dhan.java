/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author Wildhan Juniar
 */
public class AnggotaTugas1841720112Dhan {
    private int jumlah;
    private int limit;    
    private String nomorKTP;
    private String nama; 
    
    AnggotaTugas1841720112Dhan(String nomorKtp,String nama,int limit) {               
        this.nomorKTP = nomorKtp;
        this.nama = nama;
        this.limit = limit;
    }
    public String getNamaDhan() {        
        return nama; 
    }     
    public int getLimitPinjamanDhan() {        
        return limit; 
    } 
    public void pinjamDhan(int pinjam) {        
        if (pinjam < limit) {            
            jumlah = pinjam; 
        }
        else { 
            System.out.println("Maaf, Jumlah pinjaman melebihi limit!!"); 
        }    
    } 
    public int getJumlahPinjamanDhan() {
        return jumlah; 
    } 
    public void angsurDhan(int uang) {
        if(uang >= (jumlah*0.1)) {
            jumlah -= uang;
        }
        else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}