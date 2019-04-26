package control;

import control.Constants.Const;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;
import model.map.Tile;

/**
 * Controls the Visibility of all Tiles
 * @author reenawichmann
 */
public class VisibilityController 
{
    private HeroManager heroManager = HeroManager.getInstance();
    private Dungeon dungeon = null;
    private boolean explorate = true;
    
    /**
     * Uebergibt das dungeon
     * @param dungeon 
     */
    public VisibilityController(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    
    /**
     * Deckt ein weiteres Teil auf, wenn ein Hero am Rand eines Tiles steht und 
     * sich das aufzudeckende Tile nicht ausserhalb der Map befindet
     */
    public void explorateTile()
    {
        for (int i = 0; i < heroManager.getHeroes().length; i++) 
        {
            if (this.checkBorder(heroManager.getHeroes()[i]) && this.checkOutsideOfMap(heroManager.getHeroes()[i]))
            {
                    this.setTileVisible(heroManager.getHeroes()[i]); 
            }
        }
    }
    
    /**
     * Ueberprueft ob sich das aufzudeckende Tile ausserhalb der Map befindet
     * @param hero
     * @return inside: true wenn innerhalb, false wenn ausserhalb
     */
    private boolean checkOutsideOfMap(Hero hero) {
        boolean inside = true;
       
        if (hero.getPosition().getX() == 0 || hero.getPosition().getX() == Const.MAP_SIZE_X ||
                hero.getPosition().getY() == 0 || hero.getPosition().getY() == Const.MAP_SIZE_Y ) 
        {
            inside = false;
        }
        return inside;
    }
    
    /**
     * Ueberprueft ob ein Hero am Rand eines Tiles steht
     * @param hero
     * @return border: true wenn am Rand, false wenn nicht
     */
    private boolean checkBorder(Hero hero) 
    {
        Position fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(hero.getPosition());
        boolean border = false;
            //checkt ob die currentPosition vom Hero am Rand eines Tiles ist
            if ( fieldPosition.getX() == 0 || fieldPosition.getX() == 3 ||
                    fieldPosition.getY() == 0 || fieldPosition.getY() == 3)
            {
                border = true;
            }
        return border;
    }
    
    /**
     * Gibt das Tile zurueck, welches aufgedeckt werden soll
     * @param hero
     * @return 
     */
    private void setTileVisible(Hero hero) 
    {
        Position tilePosition = Converter.convertMapCoordinatesInTileCoordinates(hero.getPosition());
        Position fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(hero.getPosition());
        int x = tilePosition.getX();
        int y = tilePosition.getY();
        
        if (fieldPosition.getY() == 0) 
        {
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x, y-1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y-1)).setVisible(true);
            }
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x-1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x-1, y)).setVisible(true);
            }
            if ( fieldPosition.getX() == 3 && (!dungeon.getTile(new Position(x, y-1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y-1)).setVisible(true);
            }
            if ( fieldPosition.getX() == 3 && (!dungeon.getTile(new Position(x+1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x+1, y)).setVisible(true);
            }
            else {
                dungeon.getTile(new Position(x, y-1)).setVisible(true);
            }
        }
        
        else if (fieldPosition.getY() == 3) 
        {
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x, y+1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x-1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x-1, y)).setVisible(true);
            }
            if ( fieldPosition.getX() == 3 && (!dungeon.getTile(new Position(x, y+1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
            if ( fieldPosition.getX() == 3 && (!dungeon.getTile(new Position(x+1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x+1, y)).setVisible(true);
            }
            else {
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
        }
        else if (fieldPosition.getX() == 0) 
        {
            dungeon.getTile(new Position(x-1, y)).setVisible(true);
        }
        else if (fieldPosition.getX() == 3) 
        {
            dungeon.getTile(new Position(x+1, y)).setVisible(true);
        }
    }

}
