package control;

import control.Constants.Const;
import model.Position;

public class MovementVerifier
{

    public static boolean moveDoesResultInGameObjectLeavingMap(Position newPosition){
        int xDimension = Const.MAP_SIZE_X * Const.TILE_SIZE_X;
        int yDimension = Const.MAP_SIZE_Y * Const.TILE_SIZE_Y;

        return newPosition.getX() < 0 || newPosition.getX() > xDimension ||
                newPosition.getY() < 0 || newPosition.getY() > yDimension;
    }

    public static boolean moveResultsInGameObjectLeavingTile(Position newPosition){
        return newPosition.getX() < 0 || newPosition.getX() > Const.TILE_SIZE_X ||
                newPosition.getY() < 0 || newPosition.getY() > Const.TILE_SIZE_Y;
    }
}
