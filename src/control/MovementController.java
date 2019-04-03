package control;

import control.Constants.Const;
import model.Position;
import model.gameObject.GameObject;
import model.map.Dungeon;
import model.map.Tile;

public class MovementController
{

    private static Dungeon dungeon = null;

    public static void changePositionOfGameObject(Position currentPosition, Position newPosition, Dungeon dungeon)
    {
        MovementController.dungeon = dungeon;

        if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(newPosition))
        {
            Tile currentTile = getTileWhichContainsGivenCoordinates(currentPosition);

            currentPosition = calculateRelativePositionForTile(currentPosition);

            if (!MovementVerifier.moveResultsInGameObjectLeavingTile(newPosition))
            {
                changePositionOfGameObjectWithinOneTile(currentPosition, newPosition, currentTile);
            } else
            {
                Tile newTile = getTileWhichContainsGivenCoordinates(newPosition);
                newPosition = calculateRelativePositionForTile(newPosition);
                changePositionOfGameObjectOutsideOneTile(currentPosition, newPosition, currentTile, newTile);
            }
        }
    }

    private static Position calculateRelativePositionForTile(Position position)
    {
        return new Position(position.getX() % Const.TILE_SIZE_X,
                position.getY() % Const.TILE_SIZE_Y);
    }

    private static void changePositionOfGameObjectWithinOneTile(Position currentPosition, Position newPosition, Tile tile)
    {
        GameObject gameObject = tile.getField(currentPosition).getGameObject();
        tile.getField(currentPosition).setGameObject(null);
        tile.getField(currentPosition).setTexture(' ');
        tile.getField(newPosition).setGameObject(gameObject);
        tile.getField(newPosition).setTexture('f');
    }

    private static void changePositionOfGameObjectOutsideOneTile(Position currentPosition, Position newPosition,
                                                                 Tile currentTile, Tile newTile)
    {
        GameObject gameObject = currentTile.getField(currentPosition).getGameObject();
        currentTile.getField(currentPosition).setGameObject(null);
        currentTile.getField(currentPosition).setTexture(' ');
        newTile.getField(newPosition).setGameObject(gameObject);
        newTile.getField(newPosition).setTexture('f');
    }

    private static Tile getTileWhichContainsGivenCoordinates(Position position)
    {
        int xCoordinate = (position.getX() / Const.TILE_SIZE_X);
        int yCoordinate = (position.getY() / Const.TILE_SIZE_Y);
        return dungeon.getTile(new Position(xCoordinate, yCoordinate));
    }
}
