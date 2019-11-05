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
public class Barrier1841720112Dhan implements Destroyable1841720112Dhan {

    private int strength;

    public Barrier1841720112Dhan(int strength) {
        this.strength = strength;
    }

    public void setStrengthDhan(int strength) {
        this.strength = strength;
    }

    public int getStrengthDhan() {
        return strength;
    }

    public void destroyDhan() {
        strength -= strength * 0.1;
    }

    @Override
    public void destroyedDhan() {
        destroyDhan();
    }

    public String getBarrierInfoDhan() {
        return "\nBarrier Strength = " + strength + "\n";
    }
}