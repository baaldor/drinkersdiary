/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.data.impl;

import drinkerdiary.Core.Drinker;
import drinkerdiary.Core.Substance;
import drinkerdiary.data.DataFacade;
import drinkerdiary.data.LoadFacade;
import drinkerdiary.data.PersistenceFacade;
import java.util.Set;

/**
 *
 * @author BaalDor
 */
public class DataFacadeImpl implements DataFacade {
    private LoadFacade myLoadFacade;
    private PersistenceFacade myPersistanceFacade;
    
    public DataFacadeImpl(LoadFacade myLoadFacade, PersistenceFacade myPersistanceFacade) {
        this.myLoadFacade = myLoadFacade;
        this.myPersistanceFacade = myPersistanceFacade;
    }
    
    

    @Override
    public Set<String> loadAllDrinkerNames() {
        return this.myLoadFacade.loadAllDrinkerNames();
    }

    @Override
    public void storeDrinker(Drinker aDrinker) {
        this.myPersistanceFacade.storeDrinker(aDrinker);
    }  

    @Override
    public void storeSubstance(Substance aSubstance) {
        this.myPersistanceFacade.storeSubstance(aSubstance);
    }

    @Override
    public Set<String> loadAllSubstanceNames() {
        return this.myLoadFacade.loadAllSubstanceNames();
    }
    
}
