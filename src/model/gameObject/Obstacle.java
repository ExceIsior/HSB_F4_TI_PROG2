package model.gameObject;

import control.Constants.Const;
import model.Position;

public class Obstacle extends GameObject
{
    public Obstacle(String graphicsPath, Position position)
    {
        super(graphicsPath, position, Const.HEIGHT_OBSTACLE);
    }


}
