package control;

import control.Constants.Const;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;
import model.map.Tile;

public class VisibilityController 
{
    private Position position = null;
    private HeroManager heroManager = HeroManager.getInstance();
    private Dungeon dungeon = null;
    
    public VisibilityController(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
    
    public void explorateTile()
    {

        for (int i = 0; i < heroManager.getHeroes().length; i++) 
        {
            if (this.checkBorder(heroManager.getHeroes()[i]) && this.checkOutsideOfMap(heroManager.getHeroes()[i]))
            {
                this.getTile(heroManager.getHeroes()[i]).setVisible(true);
            }
        }
    }
    private boolean checkOutsideOfMap(Hero hero) {
        boolean inside = true;
       
        if (hero.getPosition().getX() == 0 || hero.getPosition().getX() == Const.MAP_SIZE_X ||
                hero.getPosition().getY() == 0 || hero.getPosition().getY() == Const.MAP_SIZE_Y ) 
        {
            inside = false;
        }
        return inside;
    }
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
    
    //gibt das Tile zurueck was aufgedeckt werden soll
    private Tile getTile(Hero hero) 
    {
        Tile tile = null;
        Position tilePosition = Converter.convertMapCoordinatesInTileCoordinates(hero.getPosition());
        Position fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(hero.getPosition());
        
        if (fieldPosition.getY() == 0) 
        {
            int x = tilePosition.getX();
            int y = tilePosition.getY() - 1;
            tile = dungeon.getTile(new Position(x, y));
        }
        if (fieldPosition.getY() == 3) 
        {
            int x = tilePosition.getX();
            int y = tilePosition.getY() + 1;
            tile = dungeon.getTile(new Position(x, y));
        }
        if (fieldPosition.getX() == 0) 
        {
            int x = tilePosition.getX() - 1;
            int y = tilePosition.getY();
            tile = dungeon.getTile(new Position(x, y));
        }
        if (fieldPosition.getX() == 3) 
        {
            int x = tilePosition.getX() + 1;
            int y = tilePosition.getY();
            tile = dungeon.getTile(new Position(x, y));
        }
        return tile;
    }

}
