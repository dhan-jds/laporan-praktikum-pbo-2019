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
public class Program1841720112Dhan {

    public static void main(String[] args) {
        Kucing1841720112Dhan kucingKampung = new Kucing1841720112Dhan();
        Ikan1841720112Dhan lumbalumba = new Ikan1841720112Dhan();

        Orang1841720112Dhan ani = new Orang1841720112Dhan("Ani");
        Orang1841720112Dhan budi = new Orang1841720112Dhan("Budi");

        ani.peliharaHewanDhan(kucingKampung);
        budi.peliharaHewanDhan(lumbalumba);

        ani.ajakPeliharaanJalanJalanDhan();
        budi.ajakPeliharaanJalanJalanDhan();
    }
}