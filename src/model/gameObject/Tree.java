package model.gameObject;

import model.Position;
import model.gameObject.GameObject;
import control.Constants.Const;

public class Tree extends Obstacle
{
    
    public Tree(String graphicsPath, Position position) {
        super(Const.TREE_PATH, position);
    }
    
}
