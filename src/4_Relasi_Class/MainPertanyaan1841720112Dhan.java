/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4;

/**
 *
 * @author Wildhan Juniar
 */
public class MainPertanyaan1841720112Dhan {

    public static void main(String[] args) {
        Pegawai1841720112Dhan masinis = new Pegawai1841720112Dhan("1234", "Spongebob Squarepants");
        KeretaApi1841720112Dhan keretaapi = new KeretaApi1841720112Dhan("Gaya Baru", "Bisnis", masinis);
        
        System.out.printf(keretaapi.infoDhan());
    }
}