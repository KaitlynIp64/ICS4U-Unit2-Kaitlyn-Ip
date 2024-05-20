/*
* This program is the standard jet class.
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-03-25
*/

/**
* This is the Jet class.
*/
public class Jet {
    /** The internal variable that stores speed. */
    public int speed;

    /**
    * Constructor.
    *
    * @param args no arguments
    */
    public Jet() {
    }

    /**
    * Set a jet speed.
    *
    * @param speed set speed
    */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
    * Get speed.
    *
    * @param args no arguments
    *
    * @return current speed
    */
    public int getSpeed() {
        return speed;
    }
}
