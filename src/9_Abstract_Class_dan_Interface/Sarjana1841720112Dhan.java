/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.interfacelatihan;

/**
 *
 * @author Wildhan Juniar
 */
public class Sarjana1841720112Dhan extends Mahasiswa1841720112Dhan implements ICumlaude1841720112Dhan {
    
    public Sarjana1841720112Dhan(String nama) {
        super(nama);
    }

    @Override
    public void lulusDhan() {
         System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiDhan() {
        System.out.println("IPK-ku lebih dari 3.51");
    }
}