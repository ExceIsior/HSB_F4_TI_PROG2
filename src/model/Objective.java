package model;

import model.gameObject.GameObject;
import model.gameObject.Interactive;

/**
 * Represents a quest objective that the player has to accomplish.
 *
 * @author Ismail
 */
public class Objective {

    private Interactive interactive = null;
    private int targetCount = 0;
    private int progressCount = 0;

    /**
     * Initialises the objective.
     *
     * @param interactive Game object that has to be collected or killed.
     * @param count Amount of game objects that need to be collected or killed.
     */
    public Objective(Interactive interactive, int count) {
        this.interactive = interactive;
        this.targetCount = count;
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

    /**
     * Retrieves the game object that needs to be killed or collected.
     *
     * @return Target game object
     */
    public Interactive getInteractive() {
        return this.interactive;
    }

    /**
     * Sets the target game object.
     *
     * @param interactive New target game object.
     */
    public void setInteractive(Interactive interactive) {
        this.interactive = interactive;
    }

    /**
     * Retrieves the amount of the target game object to be killed or collected.
     *
     * @return Amount of the target game object to be killed or collected.
     */
    public int getCount() {
        return this.targetCount;
    }

    /**
     * Sets the amount of target game objects to be collected or killed.
     *
     * @param count New target amount.
     */
    public void setCount(int count) {
        this.targetCount = count;
    }

    /**
     * Determines whether the objective is complete or not.
     *
     * @return Result whether objective has been completed or not.
     */
    public boolean objectiveComplete() {
        return this.progressCount >= this.targetCount;
    }
}
