package model.gameObject;

import control.Constants;
import model.gameObject.GameObject;
import resources.Obstacle;

public class Mountain extends GameObject implements Obstacle{
    
    public Mountain() {
        super(Constants.MOUNTAIN_PATH);
    }
    
}
