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
public class Staff1841720112Dhan extends Karyawan1841720112Dhan{
    
    private int lembur;
    private double gajiLembur;
    
    public void setLemburDhan(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLemburDhan() {
        return lembur;
    }
    
    public void setGajiLemburDhan(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double getGajiLemburDhan() {
        return gajiLembur;
    }
    
    public double getGajiDhan(int lembur, double gajiLembur) {
        return super.getGajiDhan() + lembur * gajiLembur;
    }
    
    @Override
    public double getGajiDhan() {
        return super.getGajiDhan() + lembur * gajiLembur;
    }
    
    public void lihatInfoDhan() {
        System.out.println("NIP : " + this.getNipDhan());
        System.out.println("Nama : " + this.getNamaDhan());
        System.out.println("Golongan : " + this.getGolonganDhan());
        System.out.println("Jml Lembur : " + this.getLemburDhan());
        System.out.printf("Gaji Lembur : %.0f\n", this.getGajiLemburDhan());
        System.out.printf("Gaji : %.0f\n", this.getGajiDhan());
    }
}