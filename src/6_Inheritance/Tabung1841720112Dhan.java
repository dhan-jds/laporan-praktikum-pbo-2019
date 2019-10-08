/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author Wildhan Juniar
 */
public class Tabung1841720112Dhan extends Bangun1841720112Dhan {
    protected int T;
    
    public void setSuperPhiDhan(double phi){
        super.phi=phi;
    }
    public void setSuperRDhan(int r){
        super.r=r;
    }
    public void setTDhan(int t){
        this.T=t;
    }
    
    public void volumeDhan(){
        System.out.println("Volume tabung adalah: " + (super.phi*super.r*super.r*this.T));
    }
}