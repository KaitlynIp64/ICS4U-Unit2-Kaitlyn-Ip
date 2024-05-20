/*
* This program is the fly test lesson work.
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-03-25
*/

/**
 * This is the FlyTest3 class.
 */
public class FlyTest3 {
    /**
     * Variable.
     */
    public static void main(String[] args) {
        Jet jet1 = new Jet();
        jet1.speed = 212;
        System.out.println(jet1.speed);

        Jet jet2 = new Jet();
        jet2.setSpeed(212);
        System.out.println(jet2.getSpeed());
    }
} 
