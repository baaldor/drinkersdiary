/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.data.mock;

import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.Substance;
import drinkerdiary.data.PersistenceFacade;

/**
 *
 * @author BaalDor
 */
public class StoreMock implements PersistenceFacade {

    @Override
    public void storeDrinker(Drinker aDrinker) {
        System.out.println("Stored the drinker named "+aDrinker.getName() + " to nowhere.");
    }

    @Override
    public void storeSubstance(Substance aSubstance) {
        System.out.println("Stored the substance named '"+aSubstance.getName() + "' to nowhere.");
    }
    
}
