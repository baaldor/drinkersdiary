package drinkerdiary.Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diary {
    private List<Consumption> consumedDrinks;
    private Drinker theDrinker;
    private String diaryName;

    public Diary(Drinker theDrinker, String diaryName) {
    }

    public String getName() {
        return this.diaryName;
    }
    
    public Diary setName(String name){
    	if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else
    		this.diaryName=name;
    	
    	return this;
    }

    public Diary addConsumption(Consumption c) {
        if(c==null)
        	throw new IllegalArgumentException("Consumpton c must not be null!");
        else{
        	if (this.consumedDrinks==null)
        		this.consumedDrinks=new ArrayList<Consumption>();
        	this.consumedDrinks.add(c);
        }
        
        return this;
    }

    public Drinker getDrinker() {
        return this.theDrinker;
    }
    
    public Diary setDrinker(Drinker d){
    	if(d==null){
    		throw new IllegalArgumentException("Drinker d must not be null!");
    	}
    	else
    		this.theDrinker=d;
    	
    	return this;
    }
    
    public List<Consumption> getConsumedDrinks(){
    	if(this.consumedDrinks==null)
    		return Collections.emptyList();
    	else
    		return this.consumedDrinks;
    }
    
    public Diary setConsumedDrinks(List<Consumption> consumedDrinks){
    	if(consumedDrinks==null){
    		throw new IllegalArgumentException("List consumedDrinks must not be null!");
    	}
    	else
    		this.consumedDrinks=consumedDrinks;
    	
    	return this;
    }
}
