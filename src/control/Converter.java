package control;

import control.Constants.Const;
import model.Position;

/**
 * Converts MapCoordinates into Field and TileCoordinates and the other way around
 */
public class Converter 
{
    /**
     * Converts Tile and FieldCoordinates into MapCoordinates
     * @param tileCoordinates as a Position
     * @param fieldCoordinates as a Position
     * @return Position with MapCoordinates
     */  
    public static Position convertTileFieldCoordinatesInMapCoordinates(Position tileCoordinates, Position fieldCoordinates) 
    {
        //TODO Exception wenn ausserhalb eines fields
        if (fieldCoordinates.getX() >= Const.TILE_SIZE_X || fieldCoordinates.getY() >= Const.TILE_SIZE_Y) 
        {
            System.out.println("falsches field");
            return null;
        }
        else 
        {
            int mapX = (Const.TILE_SIZE_X * tileCoordinates.getX()) + fieldCoordinates.getX();
            int mapY = (Const.TILE_SIZE_Y * tileCoordinates.getY()) + fieldCoordinates.getY();
            System.out.println("map X " + mapX + " mapY " +  mapY);
            return new Position(mapX, mapY);
        }
    }
    
    /**
     * Converts MapCoordinates into TileCoordinates
     * @param mapCoordinates as a Position
     * @return Position with TileCoordinates
     */
    public static Position convertMapCoordinatesInTileCoordinates(Position mapCoordinates) 
    {
        if (mapCoordinates.getX() > Const.MAP_SIZE_X * Const.TILE_SIZE_X || 
                mapCoordinates.getY() > Const.MAP_SIZE_Y * Const.TILE_SIZE_Y ) 
        {
            System.out.println((Const.MAP_SIZE_X * Const.TILE_SIZE_X) + " + outside of map");
            return null;
        }
        else {
            int tileX = (mapCoordinates.getX() / Const.TILE_SIZE_X);
            int tileY = (mapCoordinates.getY() / Const.TILE_SIZE_Y);
            
            //System.out.println("tilex " + tileX + " tiley " + tileY);
            return new Position(tileX, tileY);
        }
    }
    
    /**
     * Converts MapCoordinates in FieldCoordinates
     * @param mapCoordinates as a Position
     * @return Position with FieldCoordinates
     */
    public static Position convertMapCoordinatesInFieldCoordinates(Position mapCoordinates) 
    {
        if (mapCoordinates.getX() > Const.MAP_SIZE_X * Const.TILE_SIZE_X || 
                mapCoordinates.getY() > Const.MAP_SIZE_Y * Const.TILE_SIZE_Y ) 
        {
            System.out.println((Const.MAP_SIZE_X * Const.TILE_SIZE_X) + " + outside of map");
            return null;
        }
        else 
        {
            int fieldX = (mapCoordinates.getX() % Const.TILE_SIZE_X);
            int fieldY = (mapCoordinates.getY() % Const.TILE_SIZE_Y);
            
            //System.out.println("fieldx " + fieldX + " fieldy " + fieldY);
            return new Position(fieldX, fieldY);
        }
    }
}
