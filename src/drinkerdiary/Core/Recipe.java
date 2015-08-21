package drinkerdiary.Core;

import java.util.List;

public interface Recipe {

    public List<Ingredient> getIngredients();

    public String hasIngredient(String name);

    public String getQuantityForIngredient(String name);
}
