package drinkerdiary.data;

import drinkerdiary.Core.Diary;
import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.Recipe;
import drinkerdiary.Core.Substance;

public interface PersistenceFacade {

    public void storeDrinker(Drinker aDrinker);

//    public Diary storeDiary(Diary aDiary);
//
    public void storeSubstance(Substance aSubstance);
//
//    public Recipe storeRecipe(Recipe aRecipe);
}
