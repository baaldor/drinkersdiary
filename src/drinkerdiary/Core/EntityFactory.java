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
public abstract class EntityFactory {
    public abstract Drinker createNewDrinker();
    public abstract Substance createNewSubstance();
    public abstract AlcoholicSubstance createNewAlcoholicSubstance();
}
