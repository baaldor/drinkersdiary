package drinkerdiary.Core;

import java.util.List;

public class Diary {

    private List<Consumption> consumedDrinks;

    private Drinker theDrinker;

    private String diaryName;

    public Diary(Drinker theDrinker, String diaryName) {
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Consumption addConsumption(Consumption c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Timestamp consume(Drink d, Timestamp t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Drinker getDrinker() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
