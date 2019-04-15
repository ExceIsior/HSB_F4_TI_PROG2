package control;

import com.google.gson.Gson;
import model.gameObject.Villain;
import java.io.IOException;
import model.Factories.VillainFactory;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;
import model.map.Field;
import utilities.JsonParser;

public class Main {

    public static void main(String[] args) throws IOException {
        
       // System.out.println(new Gson().toJson(new Field("PATHTOTEXTURE", true)));
        //System.out.println(JsonParser.writeObject(DungeonCreator.generateMap()));
//       String  pos = JsonParser.writeObject(DungeonCreator.generatePositions());
//        System.out.println(pos);
//       DungeonCreator.json_ToPositionManager(pos);
        
         GameController game = new GameController();
         game.start();



//        Menu menu = new Menu();
//        menu.addMenuEntry("Say Hello", () -> System.out.println("HELLO!!!"));
//        menu.printMenu();
//        menu.runFunction(0);
//        System.out.println("Paladin Info:\n");
//        System.out.println(Heroes.PALADIN.getHero().toString());
//        System.out.println("\nMage Info:\n");
//        System.out.println(Heroes.MAGE.getHero().toString());
//        System.out.println("\nRogue Info:\n");
//        System.out.println(Heroes.ROGUE.getHero().toString());
//        System.out.println("\nRanger Info:\n");
//        System.out.println(Heroes.RANGER.getHero().toString());
//        
//        System.out.println("\nAdding Heal Potion to Paladin's inventory...");
//        Heroes.PALADIN.getHero().getInventory().addItem(HeroItems.HEAL_POTION.getHeroItem());            
//        System.out.println("Adding Heal Potion to Paladin's inventory...");
//        Heroes.PALADIN.getHero().getInventory().addItem(HeroItems.HEAL_POTION.getHeroItem()); 
//        System.out.println("Adding Heal Potion to Paladin's inventory...");
//        Heroes.PALADIN.getHero().getInventory().addItem(HeroItems.HEAL_POTION.getHeroItem());
//        System.out.println("Adding Armor Potion to Paladin's inventory...");
//        Heroes.PALADIN.getHero().getInventory().addItem(HeroItems.ARMOR_POTION.getHeroItem());
//        System.out.println("Paladin's using Heal Potion...");
//        Heroes.PALADIN.getHero().getInventory().removeItem(HeroItems.ARMOR_POTION.getHeroItem());        
//        System.out.println("\nPrinting Paladin's inventory");
//        Heroes.PALADIN.getHero().getInventory().getInventory().forEach((key, value) -> System.out.printf("Item: %s\tAmount:%d\n", key.getName(), value));
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
