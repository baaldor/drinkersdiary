/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

import drinkerdiary.Core.impl.Mass;
import drinkerdiary.Core.impl.Piece;
import drinkerdiary.Core.impl.Volume;

/**
 *
 * @author BaalDor
 */
public abstract class EntityFactory {
    public abstract Drinker createNewDrinker();
    public abstract Substance createNewSubstance();
    public abstract AlcoholicSubstance createNewAlcoholicSubstance();
    public abstract Measurable createNewMeasurable(Unit theUnit);
    public abstract Volume createNewMilliliterVolume(double value);
    public abstract Piece createPiece(double value);
    public abstract Mass crateNewGrammMass(double value);
    public abstract Ingredient createNewIngredient(Substance s, Measurable quantity, boolean isOptionalIngredient);
}
