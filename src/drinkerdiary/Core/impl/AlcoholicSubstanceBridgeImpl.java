package drinkerdiary.Core.impl;

import drinkerdiary.Core.AlcoholicSubstance;
import drinkerdiary.Core.Substance;

public class AlcoholicSubstanceBridgeImpl implements AlcoholicSubstance{
	private double doubleAlcoholicStrength;
	private Substance theSubstance;
	
	public AlcoholicSubstanceBridgeImpl(Substance baseSubstance){
		this.theSubstance=baseSubstance;
	}
	
	@Override
	public double getAlcoholicStrength() {
		return this.doubleAlcoholicStrength;
	}

	@Override
	public void setAlcoholicStrength(double alcStr) {		
		this.doubleAlcoholicStrength=alcStr;
	}

	@Override
	public String getName() {		
		return this.theSubstance.getName();
	}

	@Override
	public void setName(String name) {
		this.theSubstance.setName(name);		
	}

}
