/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

import drinkerdiary.Core.impl.ConsumptionImpl;
import drinkerdiary.Core.impl.DiaryImpl;
import java.util.List;

/**
 *
 * @author BaalDor
 */
public interface Diary {

    DiaryImpl addConsumption(ConsumptionImpl c);

    List<ConsumptionImpl> getConsumedDrinks();

    Drinker getDrinker();

    String getName();

    DiaryImpl setConsumedDrinks(List<ConsumptionImpl> consumedDrinks);

    DiaryImpl setDrinker(Drinker d);

    DiaryImpl setName(String name);
    
}
