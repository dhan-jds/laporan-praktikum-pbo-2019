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
public class TestTugasPeminjaman1841720112Dhan {
    public static void main(String[] args) {
        TugasPeminjaman1841720112Dhan p = new TugasPeminjaman1841720112Dhan();
        
        p.setIDDhan("1841720112");
        p.setNamaDhan("M. Wildhan Juniar D.S.");
        p.namaGameDhan("OVERWACTH");
        p.tampilDataDhan();
        System.out.println("Harga Bayar : " + p.hargaBayarDhan(100000, 2));   
    }
}