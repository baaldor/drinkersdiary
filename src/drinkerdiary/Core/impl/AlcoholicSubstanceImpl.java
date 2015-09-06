package drinkerdiary.Core.impl;

import drinkerdiary.Core.AlcoholicSubstance;
import drinkerdiary.Core.impl.SubstanceImpl;

public class AlcoholicSubstanceImpl extends SubstanceImpl implements AlcoholicSubstance {
	private double alcStr;
	
	public AlcoholicSubstanceImpl() {
		super();
	}

	public AlcoholicSubstanceImpl(String name) {
		super(name);		
	}
	
	public AlcoholicSubstanceImpl(String name, double alcStr) {
		this(name);	
		this.alcStr=alcStr;
	}

	@Override
	public double getAlcoholicStrength() {
		return this.alcStr;
	}

	@Override
	public void setAlcoholicStrength(double alcStr) {
		this.alcStr=alcStr;
	}

}
