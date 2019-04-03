package model.gameObject;

import model.gameObject.Interactive;
import model.Position;
import control.Constants.Const;

public class QuestItem extends Interactive {
    
    public QuestItem(Position position) {
        super(Const.QUESTITEM_PATH, position, 0, 0, null, 0);
    }
    
}
