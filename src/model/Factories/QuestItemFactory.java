
package model.Factories;

import control.Constants.Const;
import model.gameObject.QuestItem;

/**
 *
 * @author reenawichmann
 */
public class QuestItemFactory {
    public static QuestItem getQuestItem(int questItemId) {
        switch (questItemId) {
            case  Const.MUSHROOM_ID:
                return new QuestItem(
                        Const.QUESTITEM_PATH,
                        0,
                        null,
                        0,
                        0
                );

        }
        return null;
    }
}
