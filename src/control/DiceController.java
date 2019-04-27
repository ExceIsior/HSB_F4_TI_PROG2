

package control;

import control.Constants.Const;
import model.Die;

import java.util.Random;

public class DiceController {

    private static Die die;

    public static int castDie(){
        Random random = new Random();
        Die die = new Die(Const.NUMBER_CUBE_FACES);

        return (int) (random.nextFloat() * die.getNumberOfFaces());
    }

    public static void main(String[] args){
        System.out.println(DiceController.castDie());
    }
}
