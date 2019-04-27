package control;

import control.Constants.Const;
import model.Position;
import model.map.Dungeon;
import model.map.Tile;
import model.gameObject.Character;

import java.util.ArrayList;
import model.gameObject.GameObject;



public class MovementController
{
    private static Dungeon dungeon = model.Factories.DungeonFactory.getDungeon(0);;
    
    public MovementController(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public static void changePositionOfGameObject(GameObject gameObject, Position newPosition) {
        
        Position currentPosition = gameObject.getPosition();
        
        if ( (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(newPosition)) &&
                movePossibleWithoutStandingOnObstacle(newPosition) &&
                movePossibleWithoutStandingOnGameObject(newPosition) &&
                newPositionVisible(newPosition) &&
                getMoveFelder(((Character)gameObject).getAgility(), currentPosition).contains(newPosition))
        {   
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
     * Iteriert in einer Spirale durch alle Felder um den Helden herum durch 
     * (Im Umkeis "range") und speichert deren Positionen in einer ArrayListe.
     * Speichert nur Positionen ohne Hindernissen und innerhalb der map.
     */
    public static ArrayList<Position> getMoveFelder(int range, Position heroPosition)
    {
        ArrayList<Position> rangeFelder = new ArrayList<>();
        Position hP = new Position(heroPosition.getX(), heroPosition.getY());
        for (int i=1; i<= (range*2)+1; i++)
        {
            if(i%2 != 0)
            {
                for (int x=1; x <=i; x++)
                {
                    hP.setX(hP.getX()+1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && !newPositionVisible(hP)
                        && hP.getX() <= heroPosition.getX()+range
                        && hP.getY() <= heroPosition.getY()+range
                        && movePossibleWithoutStandingOnObstacle(hP)
                        && movePossibleWithoutStandingOnGameObject(hP))
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }                   
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()+1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && !newPositionVisible(hP)
                        && hP.getX() <= heroPosition.getX()+range
                        
                        && movePossibleWithoutStandingOnObstacle(hP)
                        && movePossibleWithoutStandingOnGameObject(hP))
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
                        && !newPositionVisible(hP)
                        && movePossibleWithoutStandingOnObstacle(hP)
                        && movePossibleWithoutStandingOnGameObject(hP))
                    {
                        rangeFelder.add(new Position(hP.getX(),hP.getY()));  
                    }                
                }
                for (int y=1; y <=i; y++)
                {
                    hP.setY(hP.getY()-1);
                    if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                        && !newPositionVisible(hP)
                        && movePossibleWithoutStandingOnObstacle(hP)
                        && movePossibleWithoutStandingOnGameObject(hP))
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
     * Saves those Positions in an ArrayList if they aren't outside the map.
     */
    public static ArrayList<Position> getAttackFelder(int range, Position attackPosition)
    {
        ArrayList<Position> attackFelder = new ArrayList<>();
        Position hP = new Position(attackPosition.getX(), attackPosition.getY());
      
        
        for (int y=0; y<=(2*range); y++) 
        {
            hP.setY(attackPosition.getY()-range+y);
            for (int x=0; x<=(2*range); x++)
            {
                hP.setX(attackPosition.getX()-range+x);
                if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(hP)
                    && !newPositionVisible(hP))
                {
                    attackFelder.add(new Position(hP.getX(), hP.getY()));
                }    
            }
        }           
        return attackFelder;
    }    
    
    
    
    public static ArrayList<Position> pathfinder(Position start, Position ziel)
    {
        ArrayList<Position> path = new ArrayList<>();
        ArrayList<Position> begangeneFelder = new ArrayList<>();
        Position p1 = new Position(start.getX(), start.getY());
        Position p2;
        Position p3;
        
        //TODO
        
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
}