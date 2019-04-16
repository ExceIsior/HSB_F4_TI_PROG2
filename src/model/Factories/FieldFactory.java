
package model.Factories;

import control.Constants.Const;
import control.Constants.TerrainConst;
import control.Enums.Terrains;
import model.map.Field;
import model.map.Terrain;

public class FieldFactory {
    
    public static Field getField(int fieldID) {
        switch(fieldID) {
            case TerrainConst.GRASS_ID:
                return new Field(Terrains.GRASS.getTerrain());
            case TerrainConst.MOUNTAIN_ID:
                return new Field(Terrains.MOUNTAIN.getTerrain());
            case TerrainConst.FOREST_ID:
                return new Field(Terrains.FOREST.getTerrain());
            case TerrainConst.RIVER_ID:
                return new Field(Terrains.RIVER.getTerrain());
        }
        return null;
    }
}
