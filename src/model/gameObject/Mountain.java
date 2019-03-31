package model.gameObject;

import model.Position;
import model.gameObject.GameObject;
import resources.Obstacle;
import control.Constants.Const;

public class Mountain extends GameObject implements Obstacle{
    
    public Mountain(Position position) {
        super(Const.MOUNTAIN_PATH, position);
    }
    
}
