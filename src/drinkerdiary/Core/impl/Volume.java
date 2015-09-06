package drinkerdiary.Core.impl;

import drinkerdiary.Core.Unit;

public class Volume extends SimpleMeasure {

	public Volume(double value, Unit unit){
		super(value, unit);
	}
	
	public Volume(double value){
		super(value,Unit.MILLILITER);
	}
	
    public static Volume createShot() {
        return new Volume(20);
    }

    public static Volume createDoubleShot() {
        return new Volume(40);
    }    
}
