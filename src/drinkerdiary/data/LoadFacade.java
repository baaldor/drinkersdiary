package drinkerdiary.data;

import java.util.Set;

import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.Ingredient;
import drinkerdiary.Core.Substance;

public interface LoadFacade {

    public Set<String> loadAllDrinkerNames();
    
//    public Drinker loadDrinkerByName(String name);

//    public Set<String> loadAllDiaryNames();
//
//    public Set<String> loadAllRecipeNames();
//
    public Set<String> loadAllSubstanceNames();
    public Substance loadSubstanceByName(String name);
    
    public Set<String> loadAllIngredientNames();
    public Ingredient loadIngredientByName(String name);
}
