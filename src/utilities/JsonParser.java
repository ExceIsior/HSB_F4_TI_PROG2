package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.map.Dungeon;
import model.map.Tile;

public class JsonParser {

    private static GsonBuilder gsonBuilder = new GsonBuilder();
    
    public static String writeObject(Object object){
        return gsonBuilder.create().toJson(object);
    }
    
    
    
    public Tile[][] readMap()
    {
        return null;
    }
    
    public void readSaveGame()
    {
        
    }
    
    public void writeSaveGame()
    {
        
    }
}
