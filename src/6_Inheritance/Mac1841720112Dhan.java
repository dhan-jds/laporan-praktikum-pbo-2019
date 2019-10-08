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
public class Mac1841720112Dhan extends Leptop1841720112Dhan {

    public String security;

    Mac1841720112Dhan() {
    }

    Mac1841720112Dhan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMacDhan() {
        super.tampilLeptopDhan();
        System.out.println("Security        : " + security);
    }
}