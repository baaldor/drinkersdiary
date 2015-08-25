package drinkerdiary.Core;

public class Consumption {
    private Drink consumedDrink;
    private ZonedDateTime consumingTime;

    public Consumption(Drink theDrink, ZonedDateTime drunkenAtTime) {
    	if(theDrink==null)
    		throw new IllegalArgumentException("Drink theDrink must not be null!");
    	else if (drunkenAtTime==null)
    		throw new IllegalArgumentException("Timestamp drunkenAtTime must not be null!");
    	else{
    		this.consumedDrink=theDrink;
    		this.consumingTime=drunkenAtTime;
    	}
    }

    public Drink getDrink() {
        return this.consumedDrink;
    }
    
    public Consumption setDrink(Drink d){
    	if(d==null)
    		throw new IllegalArgumentException("Drink theDrink must not be null!");
    	else
    		this.consumedDrink=d;
    	
    	return this;
    }

    public ZonedDateTime getConsumingTime() {
        return this.consumingTime;
    }
    
    public Consumption setConsumingTime(ZonedDateTime t){
    	if (t==null)
    		throw new IllegalArgumentException("Timestamp drunkenAtTime must not be null!");
    	else
    		this.consumingTime=t;
    	
    	return this;
    }
}
