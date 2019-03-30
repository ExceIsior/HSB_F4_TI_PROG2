package model.gameObject;

import control.Constants;
import model.Position;
import model.gameObject.GameObject;
import resources.Obstacle;

public class Mountain extends GameObject implements Obstacle{
    
    public Mountain(Position position) {
        super(Constants.MOUNTAIN_PATH, position);
    }
    
}
