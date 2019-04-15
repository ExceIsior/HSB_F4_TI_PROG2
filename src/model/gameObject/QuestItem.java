package model.gameObject;

import model.gameObject.Interactive;
import model.Position;
import control.Constants.Const;

public class QuestItem extends Interactive {
    
    public QuestItem() {
        super(Const.QUESTITEM_PATH, 0, null, 0, 0);
    }
    
}
