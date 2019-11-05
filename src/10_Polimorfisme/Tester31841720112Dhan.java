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
public class Tester31841720112Dhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720112Dhan pEmp = new PermanentEmployee1841720112Dhan("Dedik", 500);
        InternshipEmployee1841720112Dhan iEmp = new InternshipEmployee1841720112Dhan("Sunarto", 5);
        ElectricityBill1841720112Dhan eBill = new ElectricityBill1841720112Dhan(5, "A-1");
        Employee1841720112Dhan e[] = {pEmp, iEmp};
        Payable1841720112Dhan p[] = {pEmp, eBill};
        Employee1841720112Dhan e2[] = {pEmp, iEmp, eBill};
    }
}