

package control;

import control.Constants.Const;

import java.util.Random;

public class DiceController {

    public static int castDie(){
        Random random = new Random();
        return (int) (random.nextFloat() * Const.NUMBER_CUBE_FACES);
    }

    public static void main(String[] args){
        System.out.println(DiceController.castDie());
    }
}
