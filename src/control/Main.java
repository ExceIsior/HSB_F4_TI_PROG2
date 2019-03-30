package control;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.BorderLayout;
import model.map.Tile;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Paladin Info:\n");
        System.out.println(Heroes.Paladin.getHero().toString());
        System.out.println("\nMage Info:\n");
        System.out.println(Heroes.Mage.getHero().toString());
        System.out.println("\nRogue Info:\n");
        System.out.println(Heroes.Rogue.getHero().toString());
        System.out.println("\nRanger Info:\n");
        System.out.println(Heroes.Ranger.getHero().toString());
        
        System.out.println("\nAdding Heal Potion to Paladin's inventory...");
        Heroes.Paladin.getHero().getInventory().addItem(HeroItems.HealPotion.getHeroItem());            
        System.out.println("Adding Heal Potion to Paladin's inventory...");
        Heroes.Paladin.getHero().getInventory().addItem(HeroItems.HealPotion.getHeroItem()); 
        System.out.println("Adding Heal Potion to Paladin's inventory...");
        Heroes.Paladin.getHero().getInventory().addItem(HeroItems.HealPotion.getHeroItem());
        System.out.println("Adding Armor Potion to Paladin's inventory...");
        Heroes.Paladin.getHero().getInventory().addItem(HeroItems.ArmorPotion.getHeroItem());
        
        System.out.println("\nPrinting Paladin's inventory");
        Heroes.Paladin.getHero().getInventory().getInventory().forEach((key, value) -> System.out.printf("Item: %s\tAmount:%d\n", key.getName(), value));
//        MapController mapController = new MapController();
//        Tile[][] map = mapController.generateMap();
//
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        Gson gson = new Gson();
//        new FileWriter("C:\\USERS\\NIKLA\\DESKTOP\\map.txt").write(gson.toJson(map));
//
//        FileReader fileReader = new FileReader("C:\\USERS\\NIKLA\\DESKTOP\\map.txt");
//
//        ArrayList<Character> arrayList = new ArrayList<>();
//        while (fileReader.read() != -1)
//        {
//            arrayList.add((char) fileReader.read());
//        }
//        char[] array = new char[arrayList.size()];
//
//        for(Character c : arrayList){
//            int i = 0;
//            array[i++] = (char) c;
//        }
//
//        Tile[][] eingeleseneaMap = gson.fromJson(Arrays.toString(array), map.getClass());
    }
}
