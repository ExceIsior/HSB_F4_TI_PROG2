package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonParser {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public static String toJsonString(Object object){
        return gson.toJson(object);
    }
    
    public static void toJsonFile(Object object, String filePath){
        IOHelper.writeFile (filePath, toJsonString(object));
    }

    public static Object fromJsonFile(Class classType, String filePath){
        return gson.fromJson(IOHelper.readFile(filePath), classType);
    }
}
