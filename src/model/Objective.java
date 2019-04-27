package model;

import model.gameObject.GameObject;
import model.gameObject.Interactive;

/**
 * Represents a quest objective that the player has to accomplish.
 *
 * @author Ismail
 */
public class Objective {

    private GameObject gameObject = null;
    private int count = 0;
    private Interactive interactive = null;
    private int targetCount = 0;
    private int progressCount = 0;

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
    
    /**
     * Checks if the killed/collected interactive was the target of this
     * objective. If positive, increments the progress counter otherwise does
     * nothing.
     *
     * @param interactive
     */
    public void addToProgress(Interactive interactive) {
        if (this.interactive.equals(interactive)) {
            this.progressCount++;
        }
    }
}
