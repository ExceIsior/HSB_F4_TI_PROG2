
package model.Factories;

import control.Constants.Const;
import model.map.Field;

public class FieldFactory {
    
    public static Field getField(int fieldID) {
        switch(fieldID) {
            case Const.TERRAIN_ID:
                return new Field("T", Const.HEIGHT_TERRAIN);
            case Const.MOUNTAIN_ID:
                return new Field("M", Const.HEIGHT_OBSTACLE);
            case Const.TREE_ID:
                return new Field("Tr", Const.HEIGHT_OBSTACLE);
            case Const.RIVER_ID:
                return new Field("R", Const.HEIGHT_OBSTACLE);
        }
        return null;
    }
}
