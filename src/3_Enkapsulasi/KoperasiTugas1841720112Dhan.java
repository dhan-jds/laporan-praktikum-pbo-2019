/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

import java.util.Scanner;

/**
 *
 * @author Wildhan Juniar
 */
public class KoperasiTugas1841720112Dhan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AnggotaTugas1841720112Dhan donny = new AnggotaTugas1841720112Dhan("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaDhan());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanDhan());
        
        System.out.print("Masukan jumlah pinjaman : ");
        int pinjam =sc.nextInt();
        donny.pinjamDhan(pinjam);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanDhan());
        
        
        System.out.print("Masukan jumlah pinjaman : ");
        int pinjamn =sc.nextInt();
        donny.pinjamDhan(pinjamn);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanDhan());
        
        
        System.out.print("Masukan jumlah angsuran : ");
        int angsur = sc.nextInt();
        donny.angsurDhan(angsur);
        System.out.println("Jumlah pinjaman saat ini " + donny.getJumlahPinjamanDhan());
        
        System.out.print("Masukan angsuran : ");
        int angsurn = sc.nextInt();
        donny.angsurDhan(angsurn);
        System.out.println("Jumlah pinjaman saat ini " + donny.getJumlahPinjamanDhan()); 
    }
}