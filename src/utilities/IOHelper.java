package utilities;

import control.Constants.Const;
import control.HeroManager;
import control.PlayerManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Player;
import model.gameObject.Hero;

public class IOHelper {

    private static Scanner scanner = new Scanner(System.in);
    private static FileWriter fileWriter = null;
    private static FileReader fileReader = null;
    private static File file = null;

    public static void saveGame() {
        JsonParser.toJsonFile(HeroManager.getInstance().getHeroes(), Const.SAVE_GAME_HERO_PATH);
        JsonParser.toJsonFile(PlayerManager.getInstance().getPlayer(), Const.SAVE_GAME_PLAYER_PATH);
    }

    public static void loadGame() {
        HeroManager.getInstance().setHeroes((Hero[])JsonParser.fromJsonFile(Hero[].class, Const.SAVE_GAME_HERO_PATH));
        PlayerManager.getInstance().setPlayer((Player)JsonParser.fromJsonFile(Player.class, Const.SAVE_GAME_PLAYER_PATH));
    }

    public static String promptUserString(String message) {
        String input = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            try {
                input = scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                System.err.println(UtilityConst.ERROR_INVALID_INPUT);
                scanner.nextLine();
            }
        }
        return input;
    }

    public static int promptUserInt(String message) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.err.println(UtilityConst.ERROR_INVALID_INPUT);
                scanner.nextLine();
            }
        }
        return input;
    }

    public static void writeFile(String filePath, String content) {
        file = new File(filePath);
        file.getParentFile().mkdirs();
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e) {
            System.err.println(UtilityConst.ERROR_WRITING_FILE);
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("");
            }
        }
    }

    public static String readFile(String filePath) {
        file = new File(filePath);
        StringBuilder content = new StringBuilder();
        try {
            fileReader = new FileReader(filePath);
            for(int character = fileReader.read(); character != -1; character = fileReader.read()){
                content.append((char)character);
            }
        } catch (FileNotFoundException e) {
            System.err.println(UtilityConst.ERROR_FILE_NOT_FOUND);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println(UtilityConst.ERROR_READING_FILE);
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.err.println(UtilityConst.ERROR_CLOSING_FILE_STREAM);
                e.printStackTrace();
            }
        }
        return String.valueOf(content);
    }
}
