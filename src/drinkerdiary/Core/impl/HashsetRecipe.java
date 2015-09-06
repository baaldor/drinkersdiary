package drinkerdiary.Core.impl;

import drinkerdiary.Core.Ingredient;
import drinkerdiary.Core.Measurable;
import drinkerdiary.Core.Recipe;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashsetRecipe implements Recipe {
	private Set<Ingredient> ingredientSet;
	private String name;

	public HashsetRecipe(){
		this("A new Recipe");
	}
	
	public HashsetRecipe(String name) {
		if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else
    		this.name=name;
	}

	@Override
	public Set<Ingredient> getIngredients() {
		if (this.ingredientSet==null) 
			return Collections.emptySet();
		else
			return this.ingredientSet;
	}

	@Override
	public boolean hasIngredient(String name) {
		if (this.getIngredientToName(name)!=null)
			return true;
		else
			return false;
	}

	@Override
	public Measurable getQuantityForIngredient(String name) {
		Ingredient anIngredient = this.getIngredientToName(name);
		if (anIngredient!=null)
			return anIngredient.getQuantity();
		else
			return null;
	}
	
	public Ingredient getIngredientToName(String name){
		if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else{
			for(Ingredient anIngredient:this.getIngredients()){
				if(anIngredient.getSubstance().getName().equalsIgnoreCase(name))
					return anIngredient;				
			}
			return null;
    	}
	}

	@Override
	public HashsetRecipe addIngredient(Ingredient ingredient) {
		if(ingredient==null){
    		throw new IllegalArgumentException("Ingredient must not be null!");
    	}
    	else{
    		if (this.ingredientSet==null) 
    			this.ingredientSet=new HashSet<Ingredient>();
    		
    		this.ingredientSet.add(ingredient);
    	}
		return this;
	}

	@Override
	public HashsetRecipe setIngredients(Set<Ingredient> ingredients) {
		if(ingredients==null){
    		throw new IllegalArgumentException("Ingredients must not be null!");
    	}
    	else
    		this.ingredientSet=ingredients;
		
		return this;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public HashsetRecipe setName(String name) {
		if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else
    		this.name=name;
		
		return this;
	}

}
