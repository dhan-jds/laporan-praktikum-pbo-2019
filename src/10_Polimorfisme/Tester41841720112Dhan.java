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
public class Tester41841720112Dhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner1841720112Dhan ow = new Owner1841720112Dhan();
        ElectricityBill1841720112Dhan eBill = new ElectricityBill1841720112Dhan(5, "R-1");
        ow.payDhan(eBill);//pay for electricity bill
        System.out.println("-------------------------------");

        PermanentEmployee1841720112Dhan pEmp = new PermanentEmployee1841720112Dhan("Dedik", 500);
        ow.payDhan(pEmp);//pay for permanent employee
        System.out.println("-------------------------------");

        InternshipEmployee1841720112Dhan iEmp = new InternshipEmployee1841720112Dhan("Sunarto", 5);
        ow.showMyEmployeeDhan(pEmp);//show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmployeeDhan(iEmp);//show internship employee info
    }
}