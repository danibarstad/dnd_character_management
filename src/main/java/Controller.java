import java.util.ArrayList;

public class Controller {

    private CharacterGUI gui;
    private CharacterDB db;

    public static void main(String[] args) {
        new Controller().startApp();
    }

    private void startApp() {
        db = new CharacterDB();

        ArrayList<Character> allData = db.fetchAllCharacters();

//        gui = new CharacterGUI(this);
        gui = new CharacterGUI();
        gui.setTableData(allData);
    }

    ArrayList<Character> getAllData() {
        return db.fetchAllCharacters();
    }

    void addToDatabase(Character character) {
        db.addCharacter(character);
    }
}