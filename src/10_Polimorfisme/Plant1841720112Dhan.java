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
public class Plant1841720112Dhan {

    public void doDestroy(Destroyable1841720112Dhan d) {
        if (d instanceof WalkingZombie1841720112Dhan) {
            WalkingZombie1841720112Dhan wz = (WalkingZombie1841720112Dhan) d;
            wz.destroyedDhan();
        } else if (d instanceof JumpingZombie1841720112Dhan) {
            JumpingZombie1841720112Dhan jz = (JumpingZombie1841720112Dhan) d;
            jz.destroyedDhan();
        } else if (d instanceof Barrier1841720112Dhan) {
            Barrier1841720112Dhan b = (Barrier1841720112Dhan) d;
            b.destroyedDhan
        ();
        }
    }
}
