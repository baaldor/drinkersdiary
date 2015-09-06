package drinkerdiary.Core.impl;

import drinkerdiary.Core.Measurable;
import drinkerdiary.Core.Unit;

public class SimpleMeasure implements Measurable {

    private double myValue;

    private Unit myUnit;

    public SimpleMeasure(double value, Unit unit) {
    	if(unit==null)
    		throw new IllegalArgumentException("Unit must not be null!");
    	else
    		this.myUnit=unit;
    	
    	this.myValue=value;
    }
    
    public SimpleMeasure(Unit unit){
    	this(0,unit);
    }

    public double getValue() {
        return this.myValue;
    }

    public Unit getUnit() {
        return this.myUnit;
    }

	@Override
	public void setValue(double v) {
		this.myValue=v;		
	}
}
