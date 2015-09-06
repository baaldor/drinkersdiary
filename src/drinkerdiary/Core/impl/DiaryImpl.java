package drinkerdiary.Core.impl;

import drinkerdiary.Core.Diary;
import drinkerdiary.Core.Drinker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiaryImpl implements Diary {
    private List<ConsumptionImpl> consumedDrinks;
    private Drinker theDrinker;
    private String diaryName;

    public DiaryImpl(Drinker theDrinker, String diaryName) {
    }

    @Override
    public String getName() {
        return this.diaryName;
    }
    
    @Override
    public DiaryImpl setName(String name){
    	if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else
    		this.diaryName=name;
    	
    	return this;
    }

    @Override
    public DiaryImpl addConsumption(ConsumptionImpl c) {
        if(c==null)
        	throw new IllegalArgumentException("Consumpton c must not be null!");
        else{
        	if (this.consumedDrinks==null)
        		this.consumedDrinks=new ArrayList<ConsumptionImpl>();
        	this.consumedDrinks.add(c);
        }
        
        return this;
    }

    @Override
    public Drinker getDrinker() {
        return this.theDrinker;
    }
    
    @Override
    public DiaryImpl setDrinker(Drinker d){
    	if(d==null){
    		throw new IllegalArgumentException("Drinker d must not be null!");
    	}
    	else
    		this.theDrinker=d;
    	
    	return this;
    }
    
    @Override
    public List<ConsumptionImpl> getConsumedDrinks(){
    	if(this.consumedDrinks==null)
    		return Collections.emptyList();
    	else
    		return this.consumedDrinks;
    }
    
    @Override
    public DiaryImpl setConsumedDrinks(List<ConsumptionImpl> consumedDrinks){
    	if(consumedDrinks==null){
    		throw new IllegalArgumentException("List consumedDrinks must not be null!");
    	}
    	else
    		this.consumedDrinks=consumedDrinks;
    	
    	return this;
    }
}
