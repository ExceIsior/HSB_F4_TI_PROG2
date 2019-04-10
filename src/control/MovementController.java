package control;

import control.Constants.Const;
import model.Position;
import model.gameObject.GameObject;
import model.map.Tile;

import java.util.ArrayList;
import model.InteractiveContainer;
import model.gameObject.Hero;
import model.gameObject.Interactive;
import model.gameObject.Villain;
import model.map.Dungeon;

public class MovementController
{
    private static InteractiveMap positions = null;
    private static Dungeon dungeon = null;
    
    public MovementController(InteractiveMap positions, Dungeon dungeon) {
        this.positions = positions;
        this.dungeon = dungeon;
    }

    public static void changePositionOfInteractive(InteractiveContainer interactiveContainer, Position newPosition) {
        
        Position currentPosition = positions.getPosition(interactiveContainer);
        
        if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(newPosition))
        {
            positions.putInteractive(interactiveContainer, newPosition);
        }
    }
   
    /**
     * Iteriert durch alle Felder um den Helden herum durch (Im Umkeis "range")
     * und speichert deren Positionen in einer ArrayListe.
     * Entfernt Positionen mit Hindernissen.
     */
    public ArrayList<Position> getRangeFelder(int range, Position heroPosition)
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
    
//    public static void changePositionOfInteractive(GameObject gameObject, Position newPosition)
//    {
//        
//        currentPosition = gameObject.getPosition();
//        if (!MovementVerifier.moveDoesResultInGameObjectLeavingMap(newPosition))
//        {
//            Tile currentTile = getTileWhichContainsGivenCoordinates(currentPosition);
//
//            Position currentPositionOfTile = calculateRelativePositionForTile(currentPosition);
//            
//            if (!MovementVerifier.moveResultsInGameObjectLeavingTile(currentPosition, newPosition))
//            {
//                changePositionOfGameObjectWithinOneTile(currentPositionOfTile, newPosition, currentTile);
//            } 
//            else
//            {
//                Tile newTile = getTileWhichContainsGivenCoordinates(newPosition);
//                newPosition = calculateRelativePositionForTile(newPosition);
//                changePositionOfGameObjectOutsideOneTile(currentPositionOfTile, newPosition, currentTile, newTile);
//            }
//            gameObject.setPosition(newPosition);
//            currentPosition = gameObject.getPosition();
//        }
//    }
    

    private static Position calculateRelativePositionForTile(Position position)
    {
        return new Position(position.getX() % Const.TILE_SIZE_X,
                position.getY() % Const.TILE_SIZE_Y);
    }

    private static void changePositionOfGameObjectWithinOneTile(Position currentPosition, Position newPosition, Tile tile)
    {
//        GameObject gameObject = tile.getField(currentPosition).getGameObject();
//        tile.getField(currentPosition).setGameObject(null);
//        tile.getField(newPosition).setGameObject(gameObject);
    }

    private static void changePositionOfGameObjectOutsideOneTile(Position currentPosition, Position newPosition,
                                                                 Tile currentTile, Tile newTile)
    {
//        GameObject gameObject = currentTile.getField(currentPosition).getGameObject();
//        currentTile.getField(currentPosition).setGameObject(null);
//        newTile.getField(newPosition).setGameObject(gameObject);
    }

    public static Tile getTileWhichContainsGivenCoordinates(Position position)
    {
        int xCoordinate = (position.getX() / Const.TILE_SIZE_X);
        int yCoordinate = (position.getY() / Const.TILE_SIZE_Y);
        return dungeon.getTile(new Position(xCoordinate, yCoordinate));
    }
    
       
    
    
    //Kacke
//    public Position[] pathfinder(Position currentPosition, Position endPosition, Character c)
//    {
//        Position[] range = null;
//        Position[] rangex = null;
//        Position[] rangey = null;
//        Position[] ranged = null;
//        //Position ipose = new Position(currentPosition.getX(),currentPosition.getY());
//        
//        for (int i=0; i < c.getAgility(); i++)
//        {
//            rangex[i] = new Position(currentPosition.getX()+i, currentPosition.getY()  );
//            rangey[i] = new Position(currentPosition.getX()  , currentPosition.getY()+i);
//            ranged[i] = new Position(currentPosition.getX()+i, currentPosition.getY()+i);
//            //path[i] = new Position(currentPosition.getX()+i, currentPosition.getY()+i);
//        }
//        for (int i=0; i < c.getAgility(); i++)
//        {
//            range =  combine(rangex, rangey, ranged);
//        }
//        return range;
//    }
//    
//    public static Position[] combine(Position[] a, Position[] b, Position[] c)
//    {
//        int length = a.length + b.length + c.length;
//        Position[] result = new Position[length];
//        System.arraycopy(a, 0, result, 0, a.length);
//        System.arraycopy(b, 0, result, a.length, b.length);
//        System.arraycopy(c, 0, result, a.length + b.length, c.length);
//        return result; }
}
