package model;

import model.gameObject.Interactive;

/**
 * Represents a quest for a dungeon. Consists of a reward and objectives.
 *
 * @author Ismail
 */
public class Quest {

    private Reward reward = null;
    private Objective[] objective = null;

    /**
     * Initialises a quest.
     *
     * @param reward Reward object that the Player should receive after
     * completion.
     * @param objective Array of objectives that the player has to accomplish.
     */
    public Quest(Reward reward, Objective... objective) {
        this.objective = objective;
        this.reward = reward;
    }

    /**
     * Iterates through all objectives and adds the killed/collected
     * villain/quest item to the progress if the respective object was part of
     * the objective.
     *
     * @param interactive Villain/QuestItem that has been killed/collected.
     */
    public void addToProgress(Interactive interactive) {
        for (Objective objective : this.objective) {
            objective.addToProgress(interactive);
        }
    }

    /**
     * Retrieves the quest's reward.
     *
     * @return Reward.
     */
    public Reward getReward() {
        return reward;
    }

    /**
     * Retrieves an array of objectives.
     *
     * @return Array of objectives.
     */
    public Objective[] getObjective() {
        return this.objective;
    }

    /**
     * Checks if all Objectives are complete.
     *
     * @return true if all Objectives are complete.
     */
    public boolean checkAllObjectives() {
        for (Objective objective : this.objective) {
            if (!objective.objectiveComplete()) {
                return false;
            }
        }
        return true;
    }
}
