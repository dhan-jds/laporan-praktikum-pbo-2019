/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAPI.percobaan4;

/**
 *
 * @author Wildhan Juniar
 */
import java.util.ArrayList;

public class InputData1841720112Dhan {
    ArrayList<Mahasiswa1841720112Dhan> ListMahasiswa;

    public InputData1841720112Dhan() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataDhan(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720112Dhan mhs = new Mahasiswa1841720112Dhan(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720112Dhan> getDataDhan() {
        return ListMahasiswa;
    }
}