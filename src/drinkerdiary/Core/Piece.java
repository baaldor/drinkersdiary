package drinkerdiary.Core;

public class Piece extends SimpleMeasure {
    
    private Piece(double value, Unit unit){
        super(value, unit);
    }

    public Piece(double value) {
        this(value, Unit.PCS);
    }

    public static Piece getDozen() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
