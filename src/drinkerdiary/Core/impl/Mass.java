package drinkerdiary.Core.impl;

import drinkerdiary.Core.Unit;
import drinkerdiary.Core.impl.SimpleMeasure;

public class Mass extends SimpleMeasure {

    public Mass(double value, Unit unit) {
        super(value, unit);
    }
    
    public Mass(double value){
    	super(value, Unit.GRAMM);
    }
}
