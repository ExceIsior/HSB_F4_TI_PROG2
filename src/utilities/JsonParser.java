package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * This class eases reading and writing from or to JSON files.
 * @author Ismail
 */
public class JsonParser {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    /**
     * Serialises an object to a JSON-String.
     * @param object Object to be serialised.
     * @return JSON-String of object.
     */
    public static String toJsonString(Object object){
        return gson.toJson(object);
    }
    
    /**
     * Stores a given object to a specified path as a JSON file.
     * @param object Object to be stored.
     * @param filePath Path to JSON-File.
     */
    public static void toJsonFile(Object object, String filePath){
        IOHelper.writeFile (filePath, toJsonString(object));
    }

    /**
     * Restores an object from a JSON-File.
     * @param classType Class object of target object. (Retrieved as so: Object.class).
     * @param filePath Path to JSON-File.
     * @return Returns an object with type of Object but which can be re-casted to its target's type. 
     */
    public static Object fromJsonFile(Class classType, String filePath){
        return gson.fromJson(IOHelper.readFile(filePath), classType);
    }
}
