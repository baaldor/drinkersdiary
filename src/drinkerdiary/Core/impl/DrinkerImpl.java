/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core.impl;

import drinkerdiary.Core.Drinker;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author BaalDor
 */
public class DrinkerImpl implements Drinker {
    private String name;
    private Collection<DiaryImpl> myDiaries;

    public DrinkerImpl() {
        this("A new drinker");
    }

    public DrinkerImpl(String name) {
    	this.setName(name);
    }    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    	if(name==null){
    		throw new IllegalArgumentException("Name must not be null!");
    	}
    	else
    		this.name = name;
    }    

    @Override
    public Collection<DiaryImpl> getMyDiaries() {
    	if (this.myDiaries==null) 
    		return Collections.emptySet();
    	else
    		return this.myDiaries;
    }

    @Override
    public void setMyDiaries(Collection<DiaryImpl> myDiaries) {
        if(myDiaries==null){
        	throw new IllegalArgumentException("myDiaries must not be null!");
        }
        else
        	this.myDiaries = myDiaries;
    }    
}
