/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.Core;

import drinkerdiary.Core.impl.ConsumptionImpl;
import java.time.ZonedDateTime;

/**
 *
 * @author BaalDor
 */
public interface Consumption {

    ZonedDateTime getConsumingTime();

    Drink getDrink();

    ConsumptionImpl setConsumingTime(ZonedDateTime t);

    ConsumptionImpl setDrink(Drink d);
    
}
