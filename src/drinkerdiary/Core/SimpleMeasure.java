package drinkerdiary.Core;

public class SimpleMeasure implements Measurable {

    private double myValue;

    private Unit myUnit;

    public SimpleMeasure(double value, Unit unit) {
    }

    public double getValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Unit getUnit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
