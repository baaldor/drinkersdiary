/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

/**
 *
 * @author BaalDor
 */
public class SubstanceImpl implements Substance{
    private String name;

    public SubstanceImpl() {
        this("A new Substance");
    }
    
    public SubstanceImpl(String name) {
        this.setName(name);
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
    public String getName() {
        return this.name;
    }
    
}
