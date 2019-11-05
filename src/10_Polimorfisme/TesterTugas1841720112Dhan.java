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
public class TesterTugas1841720112Dhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WalkingZombie1841720112Dhan wz = new WalkingZombie1841720112Dhan(100, 1);
        JumpingZombie1841720112Dhan jz = new JumpingZombie1841720112Dhan(100, 2);
        Barrier1841720112Dhan b = new Barrier1841720112Dhan(100);
        Plant1841720112Dhan p = new Plant1841720112Dhan();
        System.out.println("" + wz.getZombieInfoDhan());
        System.out.println("" + jz.getZombieInfoDhan());
        System.out.println("" + b.getBarrierInfoDhan());
        System.out.println("-------------------");
        for (int i = 0; i < 4; i++) {//Destroy the enemies 4 times
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfoDhan());
        System.out.println("" + jz.getZombieInfoDhan());
        System.out.println("" + b.getBarrierInfoDhan());
    }
}
