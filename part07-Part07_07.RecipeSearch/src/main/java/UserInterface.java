
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner systemScan;
    private Scanner fileScan;
    private RecipeList recipeList;

    public UserInterface(Scanner systemScan, Scanner fileScan, RecipeList recipeList) {
        this.systemScan = systemScan;
        this.fileScan = fileScan;
        this.recipeList = recipeList;
    }

    public void start() {
        this.scanRecipes();

        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        this.processCommand();
    }

    public void processCommand() {
        while (true) {
            System.out.println("Enter command:");
            String command = this.systemScan.nextLine();

            if (command.equals("list")) {
                printRecipes(this.recipeList.getRecipes());
            }

            if (command.equals("stop")) {
                break;
            }

            if (command.contains("find")) {
                String toFind = command.split(" ")[1];

                if (toFind.equals("name")) {
                    System.out.println("Searched word:");
                    String name = this.systemScan.nextLine();

                    printRecipes(this.recipeList.findByName(name));
                }

                if (toFind.equals("cooking")) {
                    System.out.println("Max cooking time:");
                    int cookingTime = Integer.valueOf(this.systemScan.nextLine());

                    printRecipes(this.recipeList.findByCookingTime(cookingTime));
                }

                if (toFind.equals("ingredient")) {
                    System.out.println("Ingredient:");
                    String ingredient = this.systemScan.nextLine();

                    printRecipes(this.recipeList.findByIngredient(ingredient));
                }
            }
        }
    }

    public void scanRecipes() {
        while (this.fileScan.hasNextLine()) {
            String recipeName = this.fileScan.nextLine();
            int cookingTime = Integer.valueOf(this.fileScan.nextLine());
            ArrayList<String> ingredientList = new ArrayList<>();
            
            // scan ingredients
            while (this.fileScan.hasNextLine()) {
                String ingredient = this.fileScan.nextLine();

                if (ingredient.isEmpty()) {
                    break;
                }

                ingredientList.add(ingredient);
            }
            
            // add scanned recipe to recipeList
            Recipe recipe = new Recipe(recipeName, cookingTime, ingredientList);
            this.recipeList.addRecipe(recipe);
        }
    }

    public void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
}
