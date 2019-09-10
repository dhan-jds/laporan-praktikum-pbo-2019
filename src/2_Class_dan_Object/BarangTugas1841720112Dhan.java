/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Wildhan Juniar
 */
public class BarangTugas1841720112Dhan {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public void tampilBarangDhan() {
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga barang    : " + hargaDasar);
        System.out.println("Diskon          : " + diskon);
    }
    public int hargaBarangDhan(int hrg){
        return hargaDasar=hrg;
    }
    
    public float DiskonDhan(float disc){
        diskon = disc;
        return diskon;
    }

    public int hitungHargaJualDhan() {
        return (int) (hargaDasar - (diskon * hargaDasar/100));   
    }
}