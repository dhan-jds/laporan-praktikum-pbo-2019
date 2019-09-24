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
public class MainPercobaan41841720112Dhan {

    public static void main(String[] args) {
        Penumpang1841720112Dhan p = new Penumpang1841720112Dhan("12345", "Mr. Krab");
        Penumpang1841720112Dhan budi = new Penumpang1841720112Dhan("12346", "Budi");
        Gerbong1841720112Dhan gerbong = new Gerbong1841720112Dhan("A", 10);
        gerbong.setPenumpangDhan(p, 1);
        gerbong.setPenumpangDhan(budi, 1);
        System.out.println(gerbong.infoDhan());
    }
}
