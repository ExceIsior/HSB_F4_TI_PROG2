

package control;

import java.util.Random;

public class DiceController {

    public static int castDie(){
        Random random = new Random();
        return (int) (random.nextFloat() * 20);
    }

    public static void main(String[] args){
        System.out.println(DiceController.castDie());
    }
}
