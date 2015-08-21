/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

/**
 *
 * @author BaalDor
 */
public class BasicEntityFactory extends EntityFactory{

    @Override
    public Drinker createNewDrinker() {
        return new DrinkerImpl();
    }

    @Override
    public Substance createNewSubstance() {
        return new SubstanceImpl();
    }
    
}
