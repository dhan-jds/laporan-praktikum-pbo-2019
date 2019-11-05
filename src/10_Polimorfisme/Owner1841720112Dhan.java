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
public class Owner1841720112Dhan {

    public void payDhan(Payable1841720112Dhan p) {
        System.out.println("Total payment = " + p.getPaymentAmountDhan());
        if (p instanceof ElectricityBill1841720112Dhan) {
            ElectricityBill1841720112Dhan eb = (ElectricityBill1841720112Dhan) p;
            System.out.println("" + eb.getBillInfoDhan());
        } else if (p instanceof PermanentEmployee1841720112Dhan) {
            PermanentEmployee1841720112Dhan pe = (PermanentEmployee1841720112Dhan) p;
            pe.getEmployeeInfoDhan();
            System.out.println("" + pe.getEmployeeInfoDhan());
        }
    }

    public void showMyEmployeeDhan(Employee1841720112Dhan e) {
        System.out.println("" + e.getEmployeeInfoDhan());
        if (e instanceof PermanentEmployee1841720112Dhan) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}