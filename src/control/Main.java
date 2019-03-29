package control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.map.Dungeon;
import model.map.Tile;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    
    public static void main (String[] args) throws IOException {
        MapController mapController = new MapController();
        Tile[][] map = mapController.generateMap();

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = new Gson();
        new FileWriter("C:\\USERS\\NIKLA\\DESKTOP\\map.txt").write(gson.toJson(map));

        FileReader fileReader = new FileReader("C:\\USERS\\NIKLA\\DESKTOP\\map.txt");

        ArrayList<Character> arrayList = new ArrayList<>();
        while (fileReader.read() != -1)
        {
            arrayList.add((char) fileReader.read());
        }
        char[] array = new char[arrayList.size()];

        for(Character c : arrayList){
            int i = 0;
            array[i++] = (char) c;
        }

        Tile[][] eingeleseneaMap = gson.fromJson(Arrays.toString(array), map.getClass());
    }
}
