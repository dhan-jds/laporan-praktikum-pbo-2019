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
public class KeretaApi1841720112Dhan {

    private String nama;
    private String kelas;
    private Pegawai1841720112Dhan masinis;
    private Pegawai1841720112Dhan asisten;

    KeretaApi1841720112Dhan(String nama, String kelas, Pegawai1841720112Dhan masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    KeretaApi1841720112Dhan(String nama, String kelas, Pegawai1841720112Dhan masinis, Pegawai1841720112Dhan asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNamaDhan(String nama) {
        this.nama = nama;
    }

    public String getNamaDhan() {
        return nama;
    }

    public void setKelasDhan(String kelas) {
        this.kelas = kelas;
    }

    public String getKelasDhan() {
        return kelas;
    }

    public void setMasinisDhan(Pegawai1841720112Dhan masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720112Dhan getMasinisDhan() {
        return masinis;
    }

    public void setAsistenDhan(Pegawai1841720112Dhan asisten) {
        this.asisten = asisten;
    }

    public Pegawai1841720112Dhan getAsistenDhan() {
        return asisten;
    }

    public String infoDhan() {
        String info = "";

        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.infoDhan() + "\n";
        if(asisten!=null) {
            info += "Asisten : " + this.asisten.infoDhan() + "\n";
        }
        return info;
    }
}