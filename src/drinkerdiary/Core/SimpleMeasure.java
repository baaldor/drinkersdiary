package drinkerdiary.Core;

public class SimpleMeasure implements Measurable {

    private double myValue;

    private Unit myUnit;

    public SimpleMeasure(double value, Unit unit) {
    }

    public double getValue() {
        return this.myValue;
    }

    public Unit getUnit() {
        return this.myUnit;
    }

	@Override
	public void setValue(double v) {
		this.myValue=v;		
	}
}
