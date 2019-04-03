package model.gameObject;

import control.Constants.Const;
import model.Position;

public class Mountain extends Obstacle{
    
    public Mountain(Position position) {
        super(Const.MOUNTAIN_PATH, position);
    }
    
}
