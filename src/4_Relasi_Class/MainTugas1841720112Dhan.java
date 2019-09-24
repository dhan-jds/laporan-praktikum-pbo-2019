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
public class MainTugas1841720112Dhan {

    public static void main(String[] args) {
        Game1841720112Dhan g = new Game1841720112Dhan(112, "OVERWATCH", "FPS-MOBA");
        Kasir1841720112Dhan k = new Kasir1841720112Dhan(1841720112, "Larz", "laki-laki");
        Customer1841720112Dhan c = new Customer1841720112Dhan(123, "Dhan", "20 Tahun");
        Sewa1841720112Dhan s = new Sewa1841720112Dhan("10 September 2019", "30 September 2018", 150000);

        System.out.printf(g.infoDhan());
        System.out.println("----------------------------------------");
        System.out.println(k.infoDhan());
        System.out.println("----------------------------------------");
        System.out.println(c.infoDhan());
        System.out.println("----------------------------------------");
        System.out.println(s.infoDhan());
        System.out.println("Biaya Total = " + s.hitungBiayaGameDhan(20));
    }
}
