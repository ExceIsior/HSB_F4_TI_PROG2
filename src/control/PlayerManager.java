package control;

import control.Constants.Const;
import model.Player;
import model.item.Inventory;
import model.item.Material;

public class PlayerManager 
{
    private Player player = null;

    private PlayerManager() 
    {
        this.player = initPlayer();
    }

    private Player initPlayer() 
    {
        Player player = new Player(Const.DEFAULT_PLAYER_NAME,
                Const.DEFAULT_PLAYER_EXPERIENCE_POINTS,
                Const.DEFAULT_PLAYER_GOLD,
                new Inventory<Material>(Const.DEFAULT_PLAYER_INVENTORY_CAPACITY));

        return player;
    }

    public Player getPlayer() 
    {
        return player;
    }

    public void setPlayer(Player player) 
    {
        this.player = player;
    }
    
    public static PlayerManager getInstance() 
    {
        return PlayerManager_Holder.INSTANCE;
    }

    private static class PlayerManager_Holder 
    {
        private static final PlayerManager INSTANCE = new PlayerManager();
    }
}
