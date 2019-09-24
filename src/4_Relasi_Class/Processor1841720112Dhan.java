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
public class Processor1841720112Dhan {

    private String merk;
    private double cache;

    public Processor1841720112Dhan() {
    }

    public Processor1841720112Dhan(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerkDhan() {
        return merk;
    }

    public void setMerkDhan(String merk) {
        this.merk = merk;
    }

    public double getCacheDhan() {
        return cache;
    }

    public void setCacheDhan(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}