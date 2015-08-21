/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.business;

import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.EntityFactory;
import drinkerdiary.Core.Substance;
import drinkerdiary.data.DataFacade;
import java.util.Set;

/**
 *
 * @author BaalDor
 */
public class BusinessFacadeImpl implements BusinessFacade {
    
    private final DataFacade myDataFacade;
    private final EntityFactory myEntityFactory;

    public BusinessFacadeImpl(DataFacade myDataFacade, EntityFactory myEntityFactory) {
        this.myDataFacade = myDataFacade;
        this.myEntityFactory=myEntityFactory;
    } 

    @Override
    public Set<String> loadAllDrinkerNames() {
        return this.myDataFacade.loadAllDrinkerNames();
    }

    @Override
    public Drinker createNewDrinker() {
        return this.myEntityFactory.createNewDrinker();
    }

    @Override
    public void storeDrinker(Drinker myDrinker) {
        this.myDataFacade.storeDrinker(myDrinker);
    }

    @Override
    public Substance createNewSubstance() {
        return this.myEntityFactory.createNewSubstance();
    }

    @Override
    public void storeSubstance(Substance mySubstance) {
        this.myDataFacade.storeSubstance(mySubstance);
    }
    
}
