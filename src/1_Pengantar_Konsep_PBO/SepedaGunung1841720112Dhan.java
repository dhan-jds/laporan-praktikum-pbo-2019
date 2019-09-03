/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author Wildhan Juniar
 */
public class SepedaGunung1841720112Dhan extends Sepeda1841720112Dhan {
    private String tipeSuspensi;
    
    public void setTipeSuspensiDhan(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatusDhan() {
        super.cetakStatusDhan();
        System.out.println("Tipe suspensi : " + tipeSuspensi);        
    }
}