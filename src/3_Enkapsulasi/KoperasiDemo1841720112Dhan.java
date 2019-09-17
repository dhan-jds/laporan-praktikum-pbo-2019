/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter1841720112dhan;

/**
 *
 * @author Wildhan Juniar
 */
public class KoperasiDemo1841720112Dhan {
    public static void main(String[] args) {
        Anggota1841720112Dhan anggota1 = new Anggota1841720112Dhan("Dhan","Jl. Guyubrukun 2, Selokajang, Srengat, Blitar");
        System.out.println("Simpanan " + anggota1.getNamaDhan() + " : Rp " + anggota1.getSimpananDhan());
        
        anggota1.setNamaDhan("M. Wildhan Juniar D.S.");
        anggota1.setAlamatDhan("Jl. Guyubrukun 2, Selokajang, Srengat, Blitar");
        anggota1.setorDhan(100000);
        System.out.println("Simpanan " + anggota1.getNamaDhan() + " : Rp " + anggota1.getSimpananDhan());
        
        anggota1.pinjamDhan(5000);
        System.out.println("Simpanan " + anggota1.getNamaDhan() + " : Rp " + anggota1.getSimpananDhan());
    }
}