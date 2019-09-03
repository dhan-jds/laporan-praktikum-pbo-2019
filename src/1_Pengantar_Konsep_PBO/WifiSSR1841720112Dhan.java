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
public class WifiSSR1841720112Dhan extends WifiSignal1841720112Dhan {
    private String tipeJaringan;
    
    public void setTipeJaringanDhan(String newValue) {
        tipeJaringan = newValue;
    }
    
    public void cetakStatusDhan() {
        super.cetakStatusDhan();
        System.out.println("Tipe Jaringan: " + tipeJaringan);
    }
}