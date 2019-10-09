/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author Wildhan Juniar
 */
public class MainTgsManusia1841720112Dhan {

    public static void main(String[] args) {

        Manusia1841720112Dhan m = new Manusia1841720112Dhan();
        Dosen1841720112Dhan d = new Dosen1841720112Dhan();
        Mahasiswa1841720112Dhan mh = new Mahasiswa1841720112Dhan();

        System.out.println("---------------------------------------------");
        System.out.println("===================MANUSIA===================");
        m.MakanDhan();
        m.BernafasDhan();
        System.out.println("====================DOSEN====================");
        d.LemburDhan();
        d.MakanDhan();
        System.out.println("==================MAHASISWA==================");
        mh.TidurDhan();
        mh.MakanDhan();
        System.out.println("---------------------------------------------");
    }
}