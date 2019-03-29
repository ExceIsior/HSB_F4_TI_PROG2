package control;

import model.map.Dungeon;

public class Main {
    
    public static void main (String[] args) {
        MapController mapController = new MapController();
        mapController.generateMap();
        System.out.println("");
    }
}
