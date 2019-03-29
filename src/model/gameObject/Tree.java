package model.gameObject;

import control.Constants;
import model.gameObject.GameObject;
import resources.Obstacle;

public class Tree extends GameObject implements Obstacle{
    
    public Tree(String graphicsPath) {
        super(Constants.TREE_PATH);
    }
    
}
