package model;

public class Quest {
    private Reward reward = null;
    private Objective[] objective = null;
    
    public Quest(Reward reward, Objective... objective) {
        this.objective = objective;
        this.reward = reward;
    }
}
