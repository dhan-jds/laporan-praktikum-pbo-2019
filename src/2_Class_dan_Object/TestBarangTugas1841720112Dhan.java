/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Wildhan Juniar
 */
public class TestBarangTugas1841720112Dhan {
    public static void main(String[] args) {
        BarangTugas1841720112Dhan bt = new BarangTugas1841720112Dhan();

        bt.kode = "1841720112";
        bt.namaBarang = "Book";
        bt.hargaBarangDhan(15000);
        bt.DiskonDhan(10);
        bt.tampilBarangDhan();
        System.out.println("Harga Total : " + bt.hitungHargaJualDhan());
    }
}