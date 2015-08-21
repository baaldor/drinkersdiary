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
        this.name="A new Substance";
    }
    
    public SubstanceImpl(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
}
