package control;
import java.io.IOException;
import java.util.HashMap;
import model.gameObject.Hero;
import model.item.Item;

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

         GameController game = new GameController();
         game.start();

    }
}
