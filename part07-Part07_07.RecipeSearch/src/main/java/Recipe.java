import java.util.ArrayList;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredientList;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredientList() {
        return this.ingredientList;
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
