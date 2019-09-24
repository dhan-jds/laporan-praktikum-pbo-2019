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
public class Kursi1841720112Dhan {

    private String nomer;
    private Penumpang1841720112Dhan penumpang;

    public Kursi1841720112Dhan(String nomer) {
        this.nomer = nomer;

    }

    public void setNomerDhan(String nomer) {
        this.nomer = nomer;

    }

    public String getNomerDhan() {
        return nomer;
    }

    public void setPenumpangDhan(Penumpang1841720112Dhan penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang1841720112Dhan getPenumpangDhan() {
        return penumpang;

    }

    public String infoDhan() {
        String info = "";
        info += "Nomer: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.infoDhan() + "\n";
        }
        return info;
    }
}