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
public class Segitiga1841720112Dhan {

    int sudut;
    
    public int totalSudutDhan(int sudutA){
        System.out.println("Total Sudut Segitiga : " + (sudut = 180 - sudutA) + "derajat");
        return sudut;
    }
    
    public int totalSudutDhan(int sudutA, int sudutB){
        System.out.println("Total Sudut Segitiga : " + (sudut = 180 - (sudutA + sudutB)) + "derajat");
        return sudut; 
    }
    public int kelilingDhan(int sisiA, int sisiB, int sisiC){
        int keliling;
        System.out.println("Keliling Segitiga : " + (keliling = sisiA + sisiB + sisiC) + "cm");
        return keliling;
    }
    
    public double kelilingDhan(int sisiA, int sisiB){
        double c;
        System.out.println("Sisi c Segitiga : " +( c = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB))) + "cm");
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga1841720112Dhan sgt = new Segitiga1841720112Dhan();
        
        sgt.totalSudutDhan(60);
        sgt.totalSudutDhan(30, 60);
        
        sgt.kelilingDhan(5, 12, 13);
        sgt.kelilingDhan(5, 12);        
    }
}