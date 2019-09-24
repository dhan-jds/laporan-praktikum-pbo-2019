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
public class Game1841720112Dhan {

    private int id;
    private String namaGame;
    private String jenis;

    Game1841720112Dhan(){
    }

    Game1841720112Dhan(int id, String namaGame, String jenis) {
        this.id = id;
        this.namaGame = namaGame;
        this.jenis = jenis;

    }

    public void setIdDhan() {
        this.id = id;
    }

    public int getIdDhan() {
        return id;
    }

    public void setNameGameDhan() {
        this.namaGame = namaGame;
    }

    public String getNamaGameDhan() {
        return namaGame;
    }

    public void setJenisDhan() {
        this.jenis = jenis;
    }

    public String getJenisDhan() {
        return jenis;
    }

    public String infoDhan() {
        String info = "";
        info += "Id Game        : " + this.id + "\n";
        info += "Nama Game      : " + this.namaGame + "\n";
        info += "Jenis Game     : " + this.jenis + "\n";
        return info;
    }
}
