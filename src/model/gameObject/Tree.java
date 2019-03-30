package model.gameObject;

import control.Constants;
import model.Position;
import model.gameObject.GameObject;
import resources.Obstacle;

public class Tree extends GameObject implements Obstacle{
    
    public Tree(String graphicsPath, Position position) {
        super(Constants.TREE_PATH, position);
    }
    
}
