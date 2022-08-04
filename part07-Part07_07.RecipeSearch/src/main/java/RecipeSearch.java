
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipeList = new RecipeList();

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            UserInterface ui = new UserInterface(scanner, fileScan, recipeList);
            ui.start();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
