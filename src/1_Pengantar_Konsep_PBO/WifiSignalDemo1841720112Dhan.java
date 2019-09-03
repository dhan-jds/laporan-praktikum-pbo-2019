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
public class WifiSignalDemo1841720112Dhan {
    
    public static void main(String[] args) {
        WifiSignal1841720112Dhan ws1 = new WifiSignal1841720112Dhan();
        WifiSignal1841720112Dhan ws2 = new WifiSignal1841720112Dhan();
        WifiSSR1841720112Dhan ws3 = new WifiSSR1841720112Dhan();
        
        ws1.setMerekDhan("Wifi SR");
        ws1.fastDhan(10);
        ws1.gantiJumlahSignalDhan(5);
        ws1.cetakStatusDhan();
        
        ws2.setMerekDhan("Wifi R");
        ws2.fastDhan(10);
        ws2.gantiJumlahSignalDhan(5);
        ws2.slowDhan(5);
        ws2.gantiJumlahSignalDhan(3);
        ws2.cetakStatusDhan();
        
        ws3.setMerekDhan("Wifi SSR");
        ws3.fastDhan(20);
        ws3.gantiJumlahSignalDhan(4);
        ws3.fastDhan(5);
        ws3.gantiJumlahSignalDhan(5);
        ws3.setTipeJaringanDhan("LTE");
        ws3.cetakStatusDhan();
    }
}