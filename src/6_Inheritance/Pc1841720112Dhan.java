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
public class Pc1841720112Dhan extends Komputer1841720112Dhan {

    public int ukuranMonitor;

    Pc1841720112Dhan() {
    }

    Pc1841720112Dhan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPcDhan() {
        super.tampilDataDhan();
        System.out.println("Ukuran Monitor  : " + ukuranMonitor);
    }
}
