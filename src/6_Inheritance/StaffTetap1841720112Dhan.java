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
public class StaffTetap1841720112Dhan extends Staff1841720112Dhan {

    public String Golongan;
    public int Asuransi;

    public StaffTetap1841720112Dhan() {
    }

    public StaffTetap1841720112Dhan(String Golongan, int Asuransi, int Lembur, int Potongan, String Nama, String Alamat, String Jk, int Umur, int Gaji) {
        super(Lembur, Potongan, Nama, Alamat, Jk, Umur, Gaji);
        this.Golongan = Golongan;
        this.Asuransi = Asuransi;
    }

    public void tampilStaffTetapDhan() {
        System.out.println("==========Data Staff Tetap==========");
        super.tampilDataStaffDhan();
        System.out.println("Golongan            : " + Golongan);
        System.out.println("Jumlah Asuransi     : " + Asuransi);
        System.out.println("Gaji Bersih         : " + (Gaji + Lembur - Potongan - Asuransi));
    }
}