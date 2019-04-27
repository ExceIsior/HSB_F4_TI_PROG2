package model;

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
     * @return true if all Objectives are complete.
     */
    public boolean checkAllObjectives() {
        int count = 0;
        for (Objective objective1 : objective) 
        {
            if (!objective1.objectiveComplete()) {
                return false;
            }
        }
        return true;
    }
}
