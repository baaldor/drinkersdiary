package drinkerdiary.Core.impl;

import drinkerdiary.Core.Drink;
import drinkerdiary.Core.Consumption;
import java.time.ZonedDateTime;

public class ConsumptionImpl implements Consumption {
    private Drink consumedDrink;
    private ZonedDateTime consumingTime;

    public ConsumptionImpl(Drink theDrink, ZonedDateTime drunkenAtTime) {
    	if(theDrink==null)
    		throw new IllegalArgumentException("Drink theDrink must not be null!");
    	else if (drunkenAtTime==null)
    		throw new IllegalArgumentException("Timestamp drunkenAtTime must not be null!");
    	else{
    		this.consumedDrink=theDrink;
    		this.consumingTime=drunkenAtTime;
    	}
    }

    @Override
    public Drink getDrink() {
        return this.consumedDrink;
    }
    
    @Override
    public ConsumptionImpl setDrink(Drink d){
    	if(d==null)
    		throw new IllegalArgumentException("Drink theDrink must not be null!");
    	else
    		this.consumedDrink=d;
    	
    	return this;
    }

    @Override
    public ZonedDateTime getConsumingTime() {
        return this.consumingTime;
    }
    
    @Override
    public ConsumptionImpl setConsumingTime(ZonedDateTime t){
    	if (t==null)
    		throw new IllegalArgumentException("Timestamp drunkenAtTime must not be null!");
    	else
    		this.consumingTime=t;
    	
    	return this;
    }
}
