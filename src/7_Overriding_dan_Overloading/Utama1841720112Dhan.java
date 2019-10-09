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
public class Utama1841720112Dhan {
    
    public static void main(String[] args) {
        Manager1841720112Dhan man[] = new Manager1841720112Dhan[2];
        Staff1841720112Dhan staff1[] = new Staff1841720112Dhan[2];
        Staff1841720112Dhan staff2[] = new Staff1841720112Dhan[3];
        
        //pembuatan manager
        
        man[0] = new Manager1841720112Dhan();
        man[0].setNamaDhan("Tedjo");
        man[0].setNipDhan("101");
        man[0].setGolonganDhan("1");
        man[0].setTunjanganDhan(5000000);
        man[0].setBagianDhan("Administrasi");
        
        man[1] = new Manager1841720112Dhan();
        man[1].setNamaDhan("Atika");
        man[1].setNipDhan("102");
        man[1].setGolonganDhan("1");
        man[1].setTunjanganDhan(2500000);
        man[1].setBagianDhan("Pemasaran");
        
        staff1[0] = new Staff1841720112Dhan();
        staff1[0].setNamaDhan("Usman");
        staff1[0].setNipDhan("0003");
        staff1[0].setGolonganDhan("2");
        staff1[0].setLemburDhan(10);
        staff1[0].setGajiLemburDhan(10000);
        
        staff1[1] = new Staff1841720112Dhan();
        staff1[1].setNamaDhan("Anugrah");
        staff1[1].setNipDhan("0005");
        staff1[1].setGolonganDhan("2");
        staff1[1].setLemburDhan(10);
        staff1[1].setGajiLemburDhan(55000);
        man[0].setStaffDhan(staff1);
        
        staff2[0] = new Staff1841720112Dhan();
        staff2[0].setNamaDhan("Hendra");
        staff2[0].setNipDhan("0004");
        staff2[0].setGolonganDhan("3");
        staff2[0].setLemburDhan(15);
        staff2[0].setGajiLemburDhan(5500);
        
        staff2[1] = new Staff1841720112Dhan();
        staff2[1].setNamaDhan("Arie");
        staff2[1].setNipDhan("0006");
        staff2[1].setGolonganDhan("4");
        staff2[1].setLemburDhan(5);
        staff2[1].setGajiLemburDhan(100000);
        
        staff2[2] = new Staff1841720112Dhan();
        staff2[2].setNamaDhan("Mentari");
        staff2[2].setNipDhan("0007");
        staff2[2].setGolonganDhan("3");
        staff2[2].setLemburDhan(6);
        staff2[2].setGajiLemburDhan(20000);
        man[1].setStaffDhan(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoDhan();
        man[1].lihatInfoDhan();
    }
}