package model.gameObject;

import model.gameObject.Interactive;
import control.Constants;
import model.Position;

public class QuestItem extends Interactive {
    
    public QuestItem(Position position) {
        super(Constants.QUESTITEM_PATH, position, 0, 0, null);
    }
    
}
