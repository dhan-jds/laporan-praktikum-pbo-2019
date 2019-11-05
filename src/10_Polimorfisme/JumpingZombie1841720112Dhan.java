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
public class JumpingZombie1841720112Dhan extends Zombie1841720112Dhan {

    public JumpingZombie1841720112Dhan(int health, int level) {
        this.level = level;
        this.health = health;
    }

    @Override
    public void healDhan() {
        if (level == 1) {
            health += health * 0.3;
        } else if (level == 2) {
            health += health * 0.4;
        } else if (level == 3) {
            health += health * 0.5;
        }
    }

    @Override
    public void destroyedDhan() {
        health -= health * 0.1;
    }

    @Override
    public String getZombieInfoDhan() {
        String info = "\nJumping Zombie Data = \n";
        info += super.getZombieInfoDhan() + "\n";
        return info;
    }
}