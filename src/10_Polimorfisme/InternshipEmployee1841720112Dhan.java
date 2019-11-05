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
public class InternshipEmployee1841720112Dhan extends Employee1841720112Dhan {

    private int length;

    public InternshipEmployee1841720112Dhan(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthDhan() {
        return length;
    }

    public void setLengthDhan(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfoDhan() {
        String info = super.getEmployeeInfoDhan() + "\n";
        info += "Registered as internship employee for " + length + "month/s\n";
        return info;
    }
}