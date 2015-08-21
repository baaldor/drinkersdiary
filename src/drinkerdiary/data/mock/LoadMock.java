/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.data.mock;

import drinkerdiary.data.LoadFacade;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author BaalDor
 */
public class LoadMock implements LoadFacade{

    @Override
    public Set<String> loadAllDrinkerNames() {        
        return new HashSet(java.util.Arrays.asList("Jean-Luc Picard", "Geordi LaForge", "William T. Riker"));
    }

    @Override
    public Set<String> loadAllSubstanceNames() {
        return new HashSet(java.util.Arrays.asList("Milch", "Bier", "Gin"));
    }
    
}
