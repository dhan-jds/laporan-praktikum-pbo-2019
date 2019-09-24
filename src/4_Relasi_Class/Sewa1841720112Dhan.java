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
public class Sewa1841720112Dhan {
    private String sewa;
    private Game1841720112Dhan game;
    private String pengembalian;
    private int biaya;
    
    Sewa1841720112Dhan(){
    }
    Sewa1841720112Dhan(String sewa, String pengembalian, int biaya) {
        this.sewa = sewa;
        this.pengembalian = pengembalian;
        this.biaya = biaya;

    }

    public void setPenyewaanDhan(String sewa) {
        this.sewa = sewa;
    }

    public String getPenyewaanDhan() {
        return sewa;
    }
    public void setGameDhan(Game1841720112Dhan game) {
        this.game = game;
    }

    public Game1841720112Dhan getGameDhan() {
        return game;
    }

    public void setPengembalianDhan(String pengembalian) {
        this.pengembalian = pengembalian;
    }

    public String getPengembalianDhan() {
        return pengembalian;
    }

    public void setBiayaDhan(int biaya) {
        this.biaya = biaya;
    }

    public int getBiayaDhan() {
        return biaya;
    }

    public int hitungBiayaGameDhan(int hari) {
        return biaya * hari;
    }

    public String infoDhan() {
        String info = "";
        info += "Tanggal Sewa         : " + this.sewa + "\n";
        info += "Tanggal pengembalian : " + this.pengembalian + "\n";
        info += "Biaya sewa per Hari  : " + this.biaya + "\n";
        return info;
    }
}