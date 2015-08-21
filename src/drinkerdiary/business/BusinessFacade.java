/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.business;

import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.Substance;
import java.util.Set;

/**
 *
 * @author BaalDor
 */
public interface BusinessFacade {
    public Set<String> loadAllDrinkerNames();
    
    //Storing
    public void storeDrinker(Drinker myDrinker);
    public void storeSubstance(Substance mySubstance);
    
    //EntityFactory
    public Drinker createNewDrinker();
    public Substance createNewSubstance();
}
