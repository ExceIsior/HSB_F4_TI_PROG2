package control;

import control.Constants.Const;
import model.Position;
import model.map.Dungeon;
import model.map.Tile;

import java.util.ArrayList;
import model.gameObject.GameObject;



public class MovementController
{
    private static Dungeon dungeon = null;
    
    public MovementController(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public static void changePositionOfGameObject(GameObject gameObject, Position newPosition) {
        
        if ( (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(newPosition)) &&
                movePossibleWithoutStandingOnObstacle(newPosition) &&
                movePossibleWithoutStandingOnGameObject(newPosition) &&
                newPositionVisible(newPosition))
        {   
            Position currentPosition = gameObject.getPosition();
            Position tilePositionGameObject = Converter.convertMapCoordinatesInTileCoordinates(currentPosition);
            Position fieldPositionGameObject = Converter.convertMapCoordinatesInFieldCoordinates(currentPosition);
            dungeon.getTile(tilePositionGameObject).getField(fieldPositionGameObject).setGameObject(null);
        
            gameObject.setPosition(newPosition);
            tilePositionGameObject = Converter.convertMapCoordinatesInTileCoordinates(gameObject.getPosition());
            fieldPositionGameObject = Converter.convertMapCoordinatesInFieldCoordinates(gameObject.getPosition());
            dungeon.getTile(tilePositionGameObject).getField(fieldPositionGameObject).setGameObject(gameObject);
            //System.out.println("gameObject position" + gameObject.getPosition().getX() + " " + gameObject.getPosition().getX());
        }
        else {
            System.out.println("move not possible!");
        }
    }
    
   
    /**
     * Iteriert durch alle Felder um den Helden herum durch (Im Umkeis "range")
     * und speichert deren Positionen in einer ArrayListe.
     * Entfernt Positionen mit Hindernissen.
     */
    public static ArrayList<Position> getRangeFelder(int range, Position heroPosition)
    {
        ArrayList<Position> rangeFelder = null;
        Position hP = heroPosition;
        for (int i=1; i<= range/2; i++)
        {
            if(i%2 != 0)
            {
                for (int x=1; x <=i; x++)
                {
                    hP.setX(hP.getX()+x);
                    if (getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject().getHeight() < 20)
                    {
                        rangeFelder.add(hP);  
                    }                   
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()+y);
                    if (getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject().getHeight() < 20)
                    {
                        rangeFelder.add(hP);  
                    }     
                }
            }
            else {
                for (int x=1; x <=i; x++)
                {
                    hP.setX(hP.getX()-x);
                    if (getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject().getHeight() < 20)
                    {
                        rangeFelder.add(hP);  
                    }                
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()-y);
                    if (getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject().getHeight() < 20)
                    {
                        rangeFelder.add(hP);  
                    }  
                }
            }
        }
        return rangeFelder;
    }

    
    private static boolean movePossibleWithoutStandingOnObstacle(Position position) {
        boolean obstacle = true;
        if (dungeon.getTile(Converter.convertMapCoordinatesInTileCoordinates(position)).
                getField(Converter.convertMapCoordinatesInFieldCoordinates(position)).getTerrain().getHeight() == Const.HEIGHT_OBSTACLE) {
            obstacle = false;
        }
        return obstacle;
    }
    
    
    private static boolean movePossibleWithoutStandingOnGameObject(Position position) {
        boolean gameObject = true;
        if (dungeon.getTile(Converter.convertMapCoordinatesInTileCoordinates(position)).
                getField(Converter.convertMapCoordinatesInFieldCoordinates(position)).getGameObject() != null) {
            gameObject = false;
        }
        return gameObject;
    }
    private static boolean newPositionVisible(Position position) {
        boolean visible = false;
        Position tilePosition = Converter.convertMapCoordinatesInTileCoordinates(position);
        if (dungeon.getTile(tilePosition).isVisible()) {
            visible = true;
        }
        return visible;
    }

    private static Position calculateRelativePositionForTile(Position position)
    {
        return new Position(position.getX() % Const.TILE_SIZE_X,
                position.getY() % Const.TILE_SIZE_Y);
    }


    public static Tile getTileWhichContainsGivenCoordinates(Position position)
    {
        int xCoordinate = (position.getX() / Const.TILE_SIZE_X);
        int yCoordinate = (position.getY() / Const.TILE_SIZE_Y);
        return dungeon.getTile(new Position(xCoordinate, yCoordinate));
    }


}

