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
public class Manager1841720112Dhan extends Karyawan1841720112Dhan {

    public int Tunjangan;

    public Manager1841720112Dhan() {
    }

    public Manager1841720112Dhan(int Tunjangan, String Nama, String Alamat, String Jk, int Umur, int Gaji) {
        super(Nama, Alamat, Jk, Umur, Gaji);
        this.Tunjangan = Tunjangan;
    }

    public void tampilDataManagerDhan() {
        super.tampilDataKaryawanDhan();
        System.out.println("Tunjangan       : " + Tunjangan);
        System.out.println("Total Gaji      : " + (super.Gaji + Tunjangan));
    }
}