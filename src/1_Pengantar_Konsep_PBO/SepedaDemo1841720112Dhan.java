/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Wildhan Juniar
 */
public class SepedaDemo1841720112Dhan {
    public static void main(String[] args) {
        //Buat dua buah objek sepeda
        Sepeda1841720112Dhan spd1 = new Sepeda1841720112Dhan();
        Sepeda1841720112Dhan spd2 = new Sepeda1841720112Dhan();
        SepedaGunung1841720112Dhan spd3 = new SepedaGunung1841720112Dhan();
        
        //Panggil method didalam objek
        spd1.setMerekDhan("Polygone");
        spd1.tambahKecepatanDhan(10);
        spd1.gantiGearDhan(2);
        spd1.cetakStatusDhan();
        
        spd2.setMerekDhan("Wiim Cycle");
        spd2.tambahKecepatanDhan(10);
        spd2.gantiGearDhan(2);
        spd2.tambahKecepatanDhan(10);
        spd2.gantiGearDhan(3);
        spd2.cetakStatusDhan();
        
        spd3.setMerekDhan("Klinee");
        spd3.tambahKecepatanDhan(5);
        spd3.gantiGearDhan(7);
        spd3.setTipeSuspensiDhan("Gas suspension");
        spd3.cetakStatusDhan();
    }
}