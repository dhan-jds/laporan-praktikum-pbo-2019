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
public class MainPercobaan21841720112Dhan {
    public static void main(String[] args) {
        Mobil1841720112Dhan m = new Mobil1841720112Dhan();
        m.setMerkDhan("Avanza");
        m.setBiayaDhan(350000);
        
        Sopir1841720112Dhan s = new Sopir1841720112Dhan();
        s.setNamaDhan("John Doe");
        s.setBiayaDhan(200000);
        
        Pelanggan1841720112Dhan p = new Pelanggan1841720112Dhan();
        p.setNamaDhan("John Doe");
        p.setMobilDhan(m);
        p.setSopirDhan(s);
        p.setHariDhan(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalDhan());
    }
}