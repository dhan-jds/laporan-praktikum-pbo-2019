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
public class Staff1841720112Dhan extends Karyawan1841720112Dhan {

    public int Lembur, Potongan;

    public Staff1841720112Dhan() {
    }

    public Staff1841720112Dhan(int Lembur, int Potongan, String Nama, String Alamat, String Jk, int Umur, int Gaji) {
        super(Nama, Alamat, Jk, Umur, Gaji);
        this.Lembur = Lembur;
        this.Potongan = Potongan;
    }

    public void tampilDataStaffDhan() {
        super.tampilDataKaryawanDhan();
        System.out.println("Lembur          : " + Lembur);
        System.out.println("Potongan        : " + Potongan);
        System.out.println("Total Gaji      : " + (Gaji + Lembur - Potongan));
    }
}