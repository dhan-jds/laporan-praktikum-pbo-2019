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
public class Komputer1841720112Dhan {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720112Dhan() {
    }

    public Komputer1841720112Dhan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilDataDhan() {
        System.out.println("Tampil Data");
        System.out.println("Merk            : " + merk);
        System.out.println("Kec. Prosesor   : " + kecProsesor);
        System.out.println("Size Prosesor   : " + sizeMemory);
        System.out.println("Jenis Prosesor  : " + jnsProsesor);
    }
}