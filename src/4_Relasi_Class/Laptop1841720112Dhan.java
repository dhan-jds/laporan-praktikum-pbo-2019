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
public class Laptop1841720112Dhan {

    private String merk;
    private Processor1841720112Dhan proc;
    
    public Laptop1841720112Dhan() {
    }

    public Laptop1841720112Dhan(String merk, Processor1841720112Dhan proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setMerkDhan(String merk) {
        this.merk = merk;
    }
    
    public void setProcDhan(Processor1841720112Dhan proc) {
        this.proc = proc;
    }
    
    public void infoDhan() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}