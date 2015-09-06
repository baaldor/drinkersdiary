package drinkerdiary.Core.impl;

import drinkerdiary.Core.Ingredient;
import drinkerdiary.Core.Measurable;
import drinkerdiary.Core.Substance;

public class IngredientImpl implements Ingredient {
	private String name;
	private Substance baseSubstance;
	private Measurable measurableHowMuchOfSubstance;
	private boolean isOptional;
	

	public IngredientImpl(Substance s, Measurable q, boolean optional) {
		if(s==null)
			throw new IllegalArgumentException("Substance s must not be null!");
		else if(q==null)
			throw new IllegalArgumentException("Measurable q must not be null!");
		else{
			this.baseSubstance=s;
			this.measurableHowMuchOfSubstance=q;
			this.isOptional=optional;
		}
	}
	
	public IngredientImpl(Substance s, Measurable q){
		this(s,q,false);
	}	
	
	@Override
	public Substance getSubstance() {
		return this.baseSubstance;
	}

	@Override
	public Measurable getQuantity() {
		return this.measurableHowMuchOfSubstance;
	}

	@Override
	public boolean isOptional() {
		return this.isOptional;
	}

	@Override
	public Ingredient setSubstance(Substance s) {
		if(s==null)
			throw new IllegalArgumentException("Substance s must not be null!");
		else
			this.baseSubstance=s;
		
		return this;
	}

	@Override
	public Ingredient setQuantity(Measurable q) {
		if(q==null)
			throw new IllegalArgumentException("Measurable q must not be null!");
		else
			this.measurableHowMuchOfSubstance=q;
		
		return this;
	}

	@Override
	public Ingredient setIsOptional(boolean o) {
		this.isOptional=o;
		
		return this;
	}

	public String toString(){
		String retVal=this.getName();
		
		if(retVal!=null && retVal!="")			
			return retVal;
		else
			return super.toString();		
}

	@Override
	public String getName() {
		if(this.name==null || this.name==""){
			if(this.getSubstance()!=null){
				String retVal="";
				retVal=this.getSubstance().getName();
				if(this.getQuantity()!=null) 
					retVal+=" "+this.getQuantity().getValue()+" " + this.getQuantity().getUnit().toString();
				if(this.isOptional()) 
					retVal+=" (optional)";
				this.name=retVal;
			}
		}
		return this.name;
	}

}
