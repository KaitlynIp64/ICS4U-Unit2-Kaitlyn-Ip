/*
* This program is the standard airplane class.
*
* @author  Kaitlyn Ip
* @version 1.0
* @since   2024-03-25
*/

/**
* This is the airplane class.
*/
public class Airplane {
    /** The internal variable that stores speed. */
    public int speed;

    /**
    * Constructor.
    *
    * @param args no arguments
    */
    public Airplane() {
    }

    /**
    * Set an airplane speed.
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
