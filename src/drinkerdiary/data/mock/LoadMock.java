/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.data.mock;

import drinkerdiary.Core.Ingredient;
import drinkerdiary.Core.IngredientImpl;
import drinkerdiary.Core.Substance;
import drinkerdiary.Core.SubstanceImpl;
import drinkerdiary.Core.Volume;
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
        return new HashSet<String>(java.util.Arrays.asList("Milch", "Bier", "Gin"));
    }

	@Override
	public Substance loadSubstanceByName(String name) {
		return new SubstanceImpl(name);
	}

	@Override
	public Ingredient loadIngredientByName(String name) {
		return new IngredientImpl(new SubstanceImpl("Gin"), Volume.createShot(), true);
	}

	@Override
	public Set<String> loadAllIngredientNames() {
		return new HashSet<String>(java.util.Arrays.asList("Gin 20 ml (optional)"));
	}
    
}
