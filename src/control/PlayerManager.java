package control;

import control.Constants.Const;
import model.Player;
import model.item.Inventory;
import model.item.Material;

/**
 * This singleton class holds the player instance.
 *
 * @author Ismail
 */
public class PlayerManager {

    private Player player = null;

    /**
     * Instantiates the player
     */
    private PlayerManager() {
        this.player = initPlayer();
    }

    /**
     * Initialises the player with predefined default values
     *
     * @return Default player object
     */
    private Player initPlayer() {
        Player player = new Player(Const.DEFAULT_PLAYER_NAME,
                Const.DEFAULT_PLAYER_EXPERIENCE_POINTS,
                Const.DEFAULT_PLAYER_GOLD,
                new Inventory<Material>(Const.DEFAULT_PLAYER_INVENTORY_CAPACITY));

        return player;
    }

    /**
     * Returns the player instance 
     * @return Player instance
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the player object
     * @param player Player object
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Returns the singleton instance.
     * @return PlayerManager object.
     */
    public static PlayerManager getInstance() {
        return PlayerManager_Holder.INSTANCE;
    }

    /**
     * Inner class holding the singleton class object.
     */
    private static class PlayerManager_Holder {

        private static final PlayerManager INSTANCE = new PlayerManager();
    }
}
