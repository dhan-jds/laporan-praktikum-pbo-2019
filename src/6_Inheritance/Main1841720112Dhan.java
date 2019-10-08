/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6Tugas;

/**
 *
 * @author Wildhan Juniar
 */
public class Main1841720112Dhan {

    public static void main(String[] args) {

        Mac1841720112Dhan m = new Mac1841720112Dhan("Apple", 10000, 1000, "Intel i9", "Tanam", "Icloud");
        m.tampilMacDhan();

        Windows1841720112Dhan w = new Windows1841720112Dhan("Asus", 1000, 500, "Intel i7", "Lepas Pasang", "Fast Charging");
        w.tampilWindowsDhan();

        Pc1841720112Dhan p = new Pc1841720112Dhan("Razer", 1500, 1200, "Intel i7", 1080);
        p.tampilPcDhan();
    }
}