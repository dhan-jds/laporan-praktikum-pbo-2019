/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;

/**
 *
 * @author Wildhan Juniar
 */
public class Tester21841720112Dhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720112Dhan pEmp = new PermanentEmployee1841720112Dhan("Dedik", 500);
        Employee1841720112Dhan e;
        e = pEmp;
        System.out.println("" + e.getEmployeeInfoDhan());
        System.out.println("--------------------");
        System.out.println("" + pEmp.getEmployeeInfoDhan());
    }
}