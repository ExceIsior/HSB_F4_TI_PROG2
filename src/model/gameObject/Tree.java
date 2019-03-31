package model.gameObject;

import model.Position;
import model.gameObject.GameObject;
import resources.Obstacle;
import control.Constants.Const;

public class Tree extends GameObject implements Obstacle{
    
    public Tree(String graphicsPath, Position position) {
        super(Const.TREE_PATH, position);
    }
    
}
