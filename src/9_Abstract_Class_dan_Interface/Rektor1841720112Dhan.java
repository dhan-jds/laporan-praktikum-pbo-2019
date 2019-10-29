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
public class Rektor1841720112Dhan {
    public void beriSertifikatCumlaudeDhan(ICumlaude1841720112Dhan mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude");
        
        mahasiswa.kuliahDiKampusDhan();
        mahasiswa.lulusDhan();
        mahasiswa.meraihIPKTinggiDhan();
        
        System.out.println("----------------------------------------------");
    }
        
    public void beriSertifikatMawapresDhan(IBerprestasi1841720112Dhan mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi");
        
        mahasiswa.menjuaraiKompetisiDhan();
        mahasiswa.membuatPublikasiIlmiahDhan();
        
        System.out.println("----------------------------------------------");
    }
}
