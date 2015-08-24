package drinkerdiary.Core;

public interface Ingredient {

    public Substance getSubstance();
    public Ingredient setSubstance(Substance s);

    public Measurable getQuantity();
    public Ingredient setQuantity(Measurable q);

    public boolean isOptional();
    public Ingredient setIsOptional(boolean o);
}
