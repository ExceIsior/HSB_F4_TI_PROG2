package model.Factories;

import control.Constants.TerrainConst;
import control.Enums.Terrains;
import model.map.Field;

/**
 * This class supplies instances of the Field class.
 *
 * @author reenawichman
 */
public class FieldFactory {
    /**
     * Instantiates an object of Field.
     * @param fieldID ID of the field type that is to be instantiated.
     * @return Object of Field.
     */
    public static Field getField(int fieldID) 
    {
        switch(fieldID) 
        {
            case TerrainConst.GRASS_ID:
                return new Field(Terrains.GRASS.getTerrain());
            case TerrainConst.MOUNTAIN_ID:
                return new Field(Terrains.MOUNTAIN.getTerrain());
            case TerrainConst.FOREST_ID:
                return new Field(Terrains.FOREST.getTerrain());
            case TerrainConst.RIVER_ID:
                return new Field(Terrains.RIVER.getTerrain());
            default:
                return null;
        }
    }
}
