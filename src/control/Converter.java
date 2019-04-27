
package control;

import control.Constants.Const;
import model.Position;


public class Converter {
    
    
    public static Position convertTileFieldCoordinatesInMapCoordinates(Position tileCoordinates, Position fieldCoordinates) {
        //TODO Exception wenn ausserhalb eines fields
        if (fieldCoordinates.getX() >= Const.TILE_SIZE_X || fieldCoordinates.getY() >= Const.TILE_SIZE_Y) {
            System.out.println("falsches field");
            return null;
        }
        else {
            int mapX = (Const.TILE_SIZE_X * tileCoordinates.getX()) + fieldCoordinates.getX();
            int mapY = (Const.TILE_SIZE_Y * tileCoordinates.getY()) + fieldCoordinates.getY();
            System.out.println("map X " + mapX + " mapY " +  mapY);
            return new Position(mapX, mapY);
        }
    }
    
    public static Position convertMapCoordinatesInTileCoordinates(Position mapCoordinates) {
        if (mapCoordinates.getX() > Const.MAP_SIZE_X * Const.TILE_SIZE_X || 
                mapCoordinates.getY() > Const.MAP_SIZE_Y * Const.TILE_SIZE_Y ) {
            System.out.println((Const.MAP_SIZE_X * Const.TILE_SIZE_X) + " + ausserhalb der map");
            return null;
        }
        else {
            int tileX = (mapCoordinates.getX() / Const.TILE_SIZE_X);
            int tileY = (mapCoordinates.getY() / Const.TILE_SIZE_Y);
           
            return new Position(tileX, tileY);
        }
    }
    
    public static Position convertMapCoordinatesInFieldCoordinates(Position mapCoordinates) {
        if (mapCoordinates.getX() > Const.MAP_SIZE_X * Const.TILE_SIZE_X || 
                mapCoordinates.getY() > Const.MAP_SIZE_Y * Const.TILE_SIZE_Y ) {
            System.out.println((Const.MAP_SIZE_X * Const.TILE_SIZE_X) + " + ausserhalb der map");
            return null;
        }
        else {
            int fieldX = (mapCoordinates.getX() % Const.TILE_SIZE_X);
            int fieldY = (mapCoordinates.getY() % Const.TILE_SIZE_Y);
            
            //System.out.println("fieldx " + fieldX + " fieldy " + fieldY);
            return new Position(fieldX, fieldY);
        }
    }
}
