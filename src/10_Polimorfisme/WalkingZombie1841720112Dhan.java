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
public class WalkingZombie1841720112Dhan extends Zombie1841720112Dhan {

    public WalkingZombie1841720112Dhan(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healDhan() {
        if (level == 1) {
            health += health * 0.2;
        } else if (level == 2) {
            health += health * 0.3;
        } else if (level == 3) {
            health += health * 0.4;
        }
    }

    @Override
    public void destroyedDhan() {
        health -= health * 0.2;
    }

    @Override
    public String getZombieInfoDhan() {
        String info = "\nWalking Zombie Data = \n";
        info += super.getZombieInfoDhan() + "\n";
        return info;
    }
}
