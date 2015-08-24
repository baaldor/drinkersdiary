package drinkerdiary.Core;

public interface Drink {

	Recipe getRecipe();

	Drink setRecipe(Recipe theRecipe);

	String getName();

	Drink setName(String name);

	Volume getTotalQuantity();

	Drink setTotalQuantity(Volume q);

}