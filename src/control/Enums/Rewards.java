package control.Enums;

import model.Reward;
import control.Constants.RewardConst;

public enum Rewards {
    REWARD_1(new Reward(RewardConst.REWARD_1_GOLD,
            RewardConst.REWARD_1_EXPERIENCE_POINTS,
            Materials.IRON.getMaterial(),
            Materials.AMETHYST.getMaterial())),
    REWARD_2(new Reward(RewardConst.REWARD_2_GOLD,
            RewardConst.REWARD_2_EXPERIENCE_POINTS,
            Materials.CLOTH.getMaterial(),
            Materials.LEATHER.getMaterial())),
    REWARD_3(new Reward(RewardConst.REWARD_3_GOLD,
            RewardConst.REWARD_3_EXPERIENCE_POINTS,
            Materials.GOLD.getMaterial(),
            Materials.IRON.getMaterial()));

    private final Reward reward;

    private Rewards(Reward reward) {
        this.reward = reward;
    }

    public Reward getReward() {
        return this.reward;
    }
}
