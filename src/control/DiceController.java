package control;

import control.Constants.Const;
import java.util.Random;

/**
 * Represents a dice that gives a random number back.
 */
public abstract class DiceController {

    /**
     * Returns a random number from 0 to 20 "by rolling a die".
     * @return random number in between 0 and 20.
     */
    public static int rollDie()
    {
        Random random = new Random();
        return (int) (random.nextFloat() * Const.NUMBER_CUBE_FACES);
    }
    
}
