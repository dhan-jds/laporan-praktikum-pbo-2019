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
public class TugasPeminjaman1841720112Dhan {
    private int harga, hargaBayar;
    private String id, namaMember, namaGame;

   
    public void setIDDhan(String ID) {
        id = ID;
    }

    public void setNamaDhan(String name) {
        namaMember = name;
    }

    public void namaGameDhan(String game) {
        namaGame = game;
    }
    
    public void tampilDataDhan() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);  
    }

    public int hargaBayarDhan(int harga, int lamaSewa) {
        int hargabayar = harga * lamaSewa;
        return hargabayar;
    }
}