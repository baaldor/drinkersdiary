package drinkerdiary.Core;

public interface Ingredient {

    public Substance getSubstance();

    public Measurable getQuantity();

    public boolean isOptional();
}
