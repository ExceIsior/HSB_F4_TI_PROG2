package model.Factories;

import control.Constants.Const;
import control.Constants.QuestItemConst;
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
     * @param questItemID ID of the QuestItem type that is to be instantiated.
     * @return Object of QuestItem.
     */
    public static QuestItem getQuestItem(int questItemID) {
        switch (questItemID) {
            case QuestItemConst.MUSHROOM_ID:
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
