package control;

import control.Constants.Const;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;

/**
 * Controls and changes the visibility of all tiles.
 */
public class VisibilityController 
{
    private HeroManager heroManager = HeroManager.getInstance();
    private Dungeon dungeon = null;
    private boolean explorate = true;
  
    public VisibilityController(Dungeon dungeon) 
    {
        this.dungeon = dungeon;
    }
    
    /**
     * Explorates a new tile if the hero is at a border and the discovering tile 
     * is not outside of the map.
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
     * Checks if the hero is in one of the outside tiles to verify if the 
     * discovering tile is inside of the map.
     * @param hero who is at a border
     * @return inside: true if inside of map, false if outside of map
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
     * Checks if the current position of the hero is at a border of the tile.
     * @param hero
     * @return border: true if hero is at border, false if not
     */
    private boolean checkBorder(Hero hero) 
    {
        Position fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(hero.getPosition());
        boolean border = false;
            if ( fieldPosition.getX() == 0 || fieldPosition.getX() == 3 ||
                    fieldPosition.getY() == 0 || fieldPosition.getY() == 3)
            {
                border = true;
            }
        return border;
    }
    
    /**
     * Sets the tile or tiles visible which are close to the hero.
     * @param hero who is on the border
     */
    private void setTileVisible(Hero hero) 
    {
        Position tilePosition = Converter.convertMapCoordinatesInTileCoordinates(hero.getPosition());
        Position fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(hero.getPosition());
        int x = tilePosition.getX();
        int y = tilePosition.getY();
        
        //Checks if the hero is on the upper border
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
            if ( fieldPosition.getX() == Const.TILE_SIZE_X-1 && (!dungeon.getTile(new Position(x, y-1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y-1)).setVisible(true);
            }
            if ( fieldPosition.getX() == Const.TILE_SIZE_X-1 && (!dungeon.getTile(new Position(x+1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x+1, y)).setVisible(true);
            }
            else {
                dungeon.getTile(new Position(x, y-1)).setVisible(true);
            }
        }
        //Checks if the hero is on the bottom border
        else if (fieldPosition.getY() == Const.TILE_SIZE_Y-1) 
        {
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x, y+1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
            if ( fieldPosition.getX() == 0 && (!dungeon.getTile(new Position(x-1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x-1, y)).setVisible(true);
            }
            if ( fieldPosition.getX() == Const.TILE_SIZE_X-1 && (!dungeon.getTile(new Position(x, y+1)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
            if ( fieldPosition.getX() == Const.TILE_SIZE_X-1 && (!dungeon.getTile(new Position(x+1, y)).isVisible()) ) 
            {  
                dungeon.getTile(new Position(x+1, y)).setVisible(true);
            }
            else {
                dungeon.getTile(new Position(x, y+1)).setVisible(true);
            }
        }
        //Checks if the hero is on the left border
        else if (fieldPosition.getX() == 0) 
        {
            dungeon.getTile(new Position(x-1, y)).setVisible(true);
        }
        //Checks if the hero is on the right border
        else if (fieldPosition.getX() == Const.TILE_SIZE_X-1) 
        {
            dungeon.getTile(new Position(x+1, y)).setVisible(true);
        }
    }

}
