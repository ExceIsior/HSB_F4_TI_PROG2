package control.Enums;

import control.Constants.Const;
import model.map.Field;

public enum Fields {
    TERRAIN(new Field("T", Const.HEIGHT_TERRAIN)),
    TREE(new Field("Tr", Const.HEIGHT_OBSTACLE)),
    MOUNTAIN(new Field("M", Const.HEIGHT_OBSTACLE)),
    RIVER(new Field("R", Const.HEIGHT_OBSTACLE));
    
    private final Field field;
    
    private Fields(Field field) {
    this.field = field;
    }
    public Field getField() {
        return this.field;
    }
}
