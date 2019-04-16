package model;

import model.gameObject.GameObject;

/**
 * Represents a quest objective that the player has to accomplish.
 *
 * @author Ismail
 */
public class Objective {

    private GameObject gameObject = null;
    private int count = 0;

    /**
     * Initialises the objective.
     *
     * @param gameObject Game object that has to be collected or killed.
     * @param count Amount of game objects that need to be collected or killed.
     */
    public Objective(GameObject gameObject, int count) {
        this.gameObject = gameObject;
        this.count = count;
    }

    /**
     * Retrieves the game object that needs to be killed or collected.
     *
     * @return Target game object
     */
    public GameObject getGameObject() {
        return gameObject;
    }

    /**
     * Sets the target game object.
     *
     * @param gameObject New target game object.
     */
    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    /**
     * Retrieves the amount of the target game object to be killed or collected.
     *
     * @return Amount of the target game object to be killed or collected.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the amount of target game objects to be collected or killed.
     *
     * @param count New target amount.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Determines whether the objective is complete or not.
     *
     * @return Result whether objective has been completed or not.
     */
    public boolean objectiveComplete() {
        return true;
    }
}
