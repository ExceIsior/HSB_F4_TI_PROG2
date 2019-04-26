package model.Factories;

import control.Constants.Const;
import model.gameObject.QuestItem;

/**
 * This class supplies instances of the QuestItem class.
 *
 * @author reenawichmann
 */
public class QuestItemFactory {

    /**
     * Instantiates an object of QuestItemVillain
     *
     * @param questItemId ID of the QuestItem type that is to be instantiated.
     * @return Object of QuestItem.
     */
    public static QuestItem getQuestItem(int questItemId) {
        switch (questItemId) {
            case Const.MUSHROOM_ID:
                return new QuestItem(
                        Const.QUESTITEM_PATH,
                        0,
                        null,
                        0,
                        0);
            default:
                return null;
        }
    }
}
