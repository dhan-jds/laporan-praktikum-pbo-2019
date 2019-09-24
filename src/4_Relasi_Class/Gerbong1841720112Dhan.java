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
public class Gerbong1841720112Dhan {
    private String kode;
    private Kursi1841720112Dhan[] arrayKursi;

    public Gerbong1841720112Dhan(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi1841720112Dhan[jumlah];
        this.initKursiDhan();
    }

    private void initKursiDhan() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720112Dhan(String.valueOf(i + 1));
        }
    }

    public void setNamaDhan(String nama) {
        this.kode = kode;
    }

    public String getNamaDhan() {
        return kode;
    }

    public void setArrayKursiDhan(Kursi1841720112Dhan[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }

    public Kursi1841720112Dhan[] getArrayKursiDhan() {
        return arrayKursi;
    }

    public String infoDhan() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi1841720112Dhan kursi : arrayKursi) {
            info += kursi.infoDhan();
        }
        return info;
    }

    public void setPenumpangDhan(Penumpang1841720112Dhan penumpang, int nomer) {
        if(arrayKursi[nomer - 1].getPenumpangDhan()==null) {
            this.arrayKursi[nomer - 1].setPenumpangDhan(penumpang);
        }
        else {
            System.out.println("Penumpang yang tidak mendapat tempat: ");
            System.out.println(penumpang.infoDhan());
            System.out.println("Nomer : " + nomer);
        }
    }
}