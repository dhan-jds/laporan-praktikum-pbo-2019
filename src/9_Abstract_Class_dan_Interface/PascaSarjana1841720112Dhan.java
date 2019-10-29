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
public class PascaSarjana1841720112Dhan extends Mahasiswa1841720112Dhan implements ICumlaude1841720112Dhan, IBerprestasi1841720112Dhan {

    public PascaSarjana1841720112Dhan(String nama) {
        super(nama);
    }
    
    @Override
    public void lulusDhan() {
        System.out.println("Aku sudah menyelasaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiDhan() {
        System.out.println("IPK-ku lebih dari 3.71");
    }

    @Override
    public void menjuaraiKompetisiDhan() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahDhan() {
        System.out.println("Saya menerbitkan artikel di jrnal INTERNASIONAL");
    }
}