/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author Wildhan Juniar
 */
public class StaffHarian1841720112Dhan extends Staff1841720112Dhan {

    public int JmlJamKerja;

    public StaffHarian1841720112Dhan() {
    }

    public StaffHarian1841720112Dhan(int JamKerja, int Lembur, int Potongan, String Nama, String Alamat, String Jk, int Umur, int Gaji) {
        super(Lembur, Potongan, Nama, Alamat, Jk, Umur, Gaji);
        this.JmlJamKerja = JmlJamKerja;
    }

    public void tampilStaffHarianDhan() {
        System.out.println("==========Data Staff Harian==========");
        super.tampilDataStaffDhan();
        System.out.println("Jumlah Jam Keerja   : " + JmlJamKerja);
        System.out.println("Gaji Bersih         : " + (JmlJamKerja * Gaji + Lembur - Potongan));
    }
}
