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
public class MainInterface1841720112Dhan {

    public static void main(String[] args) {

        Rektor1841720112Dhan pakRektor = new Rektor1841720112Dhan();

        Mahasiswa1841720112Dhan mahasiswaBiasa = new Mahasiswa1841720112Dhan("Charlie");
        Sarjana1841720112Dhan sarjanaCumlaude = new Sarjana1841720112Dhan("Dini");
        PascaSarjana1841720112Dhan masterCumlaude = new PascaSarjana1841720112Dhan("Elok");

        //pakRektor.beriSertifikatCumlaudeDhan (mahasiswaBiasa);

        //pakRektor.beriSertifikatCumlaudeDhan(sarjanaCumlaude);

        //pakRektor.beriSertifikatCumlaudeDhan(masterCumlaude);
        
        //pakRektor.beriSertifikatMawapresDhan(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapresDhan(masterCumlaude);
    }
}