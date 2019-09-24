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
public class MainPercobaan11841720112Dhan {

    public static void main(String[] args) {
        Processor1841720112Dhan p = new Processor1841720112Dhan("Intel i5", 3);
        Laptop1841720112Dhan L = new Laptop1841720112Dhan("Thinkpad", p);

        L.infoDhan();

        Processor1841720112Dhan p1 = new Processor1841720112Dhan();
        p1.setMerkDhan("Intel i5");
        p1.setCacheDhan(4);
        Laptop1841720112Dhan L1 = new Laptop1841720112Dhan();
        L1.setMerkDhan("Thinkpad");
        L1.setProcDhan(p1);
        L1.infoDhan();
    }
}