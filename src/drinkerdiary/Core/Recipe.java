package drinkerdiary.Core;

import java.util.Set;

public interface Recipe {
	public String getName();
	public Recipe setName(String name);

    public Set<Ingredient> getIngredients();
    public Recipe setIngredients(Set<Ingredient> ingredients);

    public boolean hasIngredient(String name);

    public Measurable getQuantityForIngredient(String name);
    
    public Recipe addIngredient(Ingredient ingredient);
}
