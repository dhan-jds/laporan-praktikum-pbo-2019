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
public class Leptop1841720112Dhan extends Komputer1841720112Dhan {

    public String jnsBatrei;

    Leptop1841720112Dhan() {
    }

    Leptop1841720112Dhan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super (merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLeptopDhan(){
        super.tampilDataDhan();
        System.out.println("Jenis Baterai   : " + jnsBatrei);
    }
}