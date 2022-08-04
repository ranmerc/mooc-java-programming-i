import java.util.ArrayList;

public class RecipeList {
    
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> findByName(String name) {
        ArrayList<Recipe> results = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                results.add(recipe);
            }
        }
        
        return results;
    }
    
    public ArrayList<Recipe> findByCookingTime(int time) {
        ArrayList<Recipe> results = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                results.add(recipe);
            }
        }
        
        return results;
    }
    
    public ArrayList<Recipe> findByIngredient(String ingredient) {
        ArrayList<Recipe> results = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            if (recipe.getIngredientList().contains(ingredient)) {
                results.add(recipe);
            }
        }
        
        return results;
    }
}
