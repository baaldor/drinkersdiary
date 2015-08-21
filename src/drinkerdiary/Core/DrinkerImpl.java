/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

import java.util.Collection;

/**
 *
 * @author BaalDor
 */
public class DrinkerImpl implements Drinker {
    private String name;
    private Collection<Diary> myDiaries;

    public DrinkerImpl() {
        this.name="A new drinker";
    }

    public DrinkerImpl(String name) {
        this.name = name;
    }    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }    

    @Override
    public Collection<Diary> getMyDiaries() {
        return this.myDiaries;
    }

    @Override
    public void setMyDiaries(Collection<Diary> myDiaries) {
        this.myDiaries = myDiaries;
    }    
}
