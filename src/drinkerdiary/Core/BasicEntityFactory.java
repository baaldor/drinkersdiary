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
public class BasicEntityFactory extends EntityFactory{

    @Override
    public Drinker createNewDrinker() {
        return new DrinkerImpl();
    }

    @Override
    public Substance createNewSubstance() {
        return new SubstanceImpl();
    }

	@Override
	public AlcoholicSubstance createNewAlcoholicSubstance() {
		return new AlcoholicSubstanceImpl();
	}

	@Override
	public Ingredient createNewIngredient(Substance s, Measurable quantity, boolean isOptionalIngredient) {
		return new IngredientImpl(s, quantity, isOptionalIngredient);
	}

	@Override
	public Measurable createNewMeasurable(Unit theUnit) {
		return new SimpleMeasure(theUnit);
	}

	@Override
	public Volume createNewMilliliterVolume(double value) {
		return new Volume(value);
	}

	@Override
	public Piece createPiece(double value) {
		return new Piece(value);
	}

	@Override
	public Mass crateNewGrammMass(double value) {
		return new Mass(value);
	}
	
}
