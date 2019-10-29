/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author Wildhan Juniar
 */
public class Orang1841720112Dhan {
    private String nama;
    private Hewan1841720112Dhan hewanPeliharaan;
    
    public Orang1841720112Dhan(String nama){
        this.nama = nama;
    }
    public void peliharaHewanDhan(Hewan1841720112Dhan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalanDhan(){
        System.out.println("Namaku : " + this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerakDhan();
        System.out.println("-------------------------------------------------");
    }
}