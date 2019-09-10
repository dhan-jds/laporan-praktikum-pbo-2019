/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author Wildhan Juniar
 */
public class Lingkaran1841720112Dhan {
    public double phi;
    public double r;
    
    public double LuasDhan() {
        double luas = phi * r;
        return luas;
    }
    
    public double KelilingDhan() {
        double keliling = phi * r/2;
        return keliling;
    }
    
    public void cetakHasilDhan(){
        System.out.println("PHI : "+ phi);
        System.out.println("Jari-jari : "+r);
        System.out.println("Luas : "+ LuasDhan());
        System.out.println("Keliling : "+ KelilingDhan());
    }
}