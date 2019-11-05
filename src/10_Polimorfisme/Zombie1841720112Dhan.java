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
public abstract class Zombie1841720112Dhan implements Destroyable1841720112Dhan {

    protected int health;
    protected int level;

    public String getZombieInfoDhan() {
        return "\nHealth = " + health + "\nLevel = " + level;
    }

    public abstract void healDhan();

    @Override
    public abstract void destroyedDhan();
}