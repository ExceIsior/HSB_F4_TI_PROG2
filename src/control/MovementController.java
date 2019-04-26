package control;

import control.Constants.Const;
import model.Position;
import model.map.Dungeon;
import model.map.Tile;

import java.util.ArrayList;
import model.gameObject.GameObject;

public class MovementController
{
    private static Dungeon dungeon = model.Factories.DungeonFactory.getDungeon(0);;
    
    public MovementController(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    
    /**
     * Changes the position of the GameObject if the move is possible without 
     * standing on another GameObject or an Obstacle and without leaving the visible map.
     * @param gameObject which is going to move.
     * @param newPosition where the gameobject is going to move.
     */
    public static void changePositionOfGameObject(GameObject gameObject, Position newPosition) 
    {
        
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
        }
        else {
            System.out.println("Move not possible!");
        }
    }
    
   
    /**
     * Iteriert in einer Spirale durch alle Felder um den Helden herum durch 
     * (Im Umkeis "range") und speichert deren Positionen in einer ArrayListe.
     * Speichert nur Positionen ohne Hindernissen und innerhalb der map.
     */
    public static ArrayList<Position> getRangeFelder(int range, Position heroPosition)
    {
        ArrayList<Position> rangeFelder = new ArrayList<>();
        Position hP = heroPosition;
        for (int i=1; i<= (range*2)+1; i++)
        {
            if(i%2 != 0)
            {
                for (int x=1; x <=i; x++)
                {
                    hP.setX(hP.getX()+1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && hP.getY() <= heroPosition.getY()
                        && getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject() == null)
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }                   
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()+1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && hP.getY() <= heroPosition.getY()
                        && getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject() == null)
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }     
                }
            }
            else {
                for (int x=1; x <=i; x++)
                {
                    hP.setX(hP.getX()-1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && hP.getX() <= heroPosition.getX()
                        && getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject() == null)
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }                
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()-1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && hP.getY() <= heroPosition.getY()
                        && getTileWhichContainsGivenCoordinates(hP).getField
                       (calculateRelativePositionForTile(hP)).getGameObject() == null)
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }  
                }
            }
        }
        return rangeFelder;
    }
    
    /**
     * Iterates through all Fields in a radius "range", around a given Position.
     * Saves those positions in an ArrayList if they aren't outside the map.
     */
    public static ArrayList<Position> getAttackFelder(int range, Position attackPosition)
    {
        ArrayList<Position> attackFelder = new ArrayList<>();
        Position hP = new Position(attackPosition.getX(), attackPosition.getY());
        hP.setY(hP.getY()-range);
        
        for (int i=0; i<=(2*range); i++) 
        {
            hP.setX(attackPosition.getX()-range);
            for (int a=0; a<=(2*range); a++)
            {
                hP.setX(hP.getX()+1);
                if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP))
                {
                    attackFelder.add(new Position(hP.getX(), hP.getY()));
                }    
            }
            hP.setY(hP.getY()+1);
        }           
        return attackFelder;
    }    
    
    
    
    public static ArrayList<Position> pathfinder(Position start, Position ziel)
    {
        ArrayList<Position> path = new ArrayList<>();
        
        
        
        return path;
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