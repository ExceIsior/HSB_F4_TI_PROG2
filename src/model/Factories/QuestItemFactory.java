package model.Factories;

import control.Constants.Const;
import model.gameObject.QuestItem;

public class QuestItemFactory 
{
    /**
     * Instantiates an object of QuestItem.
     * @param questItemId ID of the questItem type that is to be instantiated.
     * @return Object of QuestItem.
     */
    public static QuestItem getQuestItem(int questItemId) 
    {
        switch (questItemId) 
        {
            case  Const.MUSHROOM_ID:
                return new QuestItem(
                        Const.QUESTITEM_PATH,
                        0,
                        null,
                        0,
                        0
                );
            default:
                return null;
        }
    }
}
