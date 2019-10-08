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
public class Karyawan1841720112Dhan {

    public String Nama, Alamat, Jk;
    public int Umur, Gaji;

    public Karyawan1841720112Dhan() {
    }

    public Karyawan1841720112Dhan(String Nama, String Alamat, String Jk, int Umur, int Gaji) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Jk = Jk;
        this.Umur = Umur;
        this.Gaji = Gaji;
    }

    public void tampilDataKaryawanDhan() {
        System.out.println("Nama            : " + Nama);
        System.out.println("Alamat          : " + Alamat);
        System.out.println("Jenis Kelamin   : " + Jk);
        System.out.println("Umur            : " + Umur);
        System.out.println("Gaji            : " + Gaji);
    }
}