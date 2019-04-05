package control;

import model.gameObject.Villain;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Villain ork1 = model.Factories.VillainFactory.getVillain("ork");
        Villain ork2 = model.Factories.VillainFactory.getVillain("ork");
        System.out.printf("%d\n%d\n", ork1.getArmor(), ork2.getArmor());
        ork1.setArmor(99);
        System.out.printf("%d\n%d\n", ork1.getArmor(), ork2.getArmor());
//        MapController mapController = new MapController();
//
//        Dungeon dungeon = new Dungeon("", null, mapController.generateMap());
//        mapController.ausgeben(dungeon);
//
//        MovementController.changePositionOfGameObject(new Position(0,0), new Position(0,6), dungeon);
//
//        System.out.println();
//        mapController.ausgeben(dungeon);

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
