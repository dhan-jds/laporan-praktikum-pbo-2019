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
public class Windows1841720112Dhan extends Leptop1841720112Dhan {

    public String fitur;

    Windows1841720112Dhan() {
    }

    Windows1841720112Dhan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor,
                sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;

    }

    public void tampilWindowsDhan() {
        super.tampilLeptopDhan();
        System.out.println("Fitur           : " + fitur);
    }
}