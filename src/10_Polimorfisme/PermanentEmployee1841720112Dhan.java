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
public class PermanentEmployee1841720112Dhan extends Employee1841720112Dhan implements Payable1841720112Dhan {

    private int salary;

    public PermanentEmployee1841720112Dhan(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryDhan() {
        return salary;
    }

    public void setSalaryDhan(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmountDhan() {
        return (int) (salary + 0.05 * salary);
    }

    @Override
    public String getEmployeeInfoDhan() {
        String info = super.getEmployeeInfoDhan() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}   