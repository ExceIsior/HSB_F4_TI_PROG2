package model.gameObject;

import control.Constants.Const;
import model.Position;

public class Tree extends Obstacle
{
    
    public Tree(Position position) {
        super(Const.TREE_PATH, position);
    }
    
}
