package drinkerdiary.Core;

public class DrinkImpl implements Drink {
    private Recipe theDrinksRecipe;
    private String theDrinksName;
    private Volume theDrinksTotalQuantity;

    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#getRecipe()
	 */
    @Override
	public Recipe getRecipe() {
        return this.theDrinksRecipe;
    }
    
    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#setRecipe(drinkerdiary.Core.Recipe)
	 */
    @Override
	public DrinkImpl setRecipe(Recipe theRecipe){
    	if(theRecipe==null)
    		throw new IllegalArgumentException("Recipe must not be null!");
    	else
    		this.theDrinksRecipe=theRecipe;
    	
    	return this;
    }

    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#getName()
	 */
    @Override
	public String getName() {
        return this.theDrinksName;
    }
    
    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#setName(java.lang.String)
	 */
    @Override
	public DrinkImpl setName(String name){
    	if(name==null)
    		throw new IllegalArgumentException("Name must not be null!");
    	else
    		this.theDrinksName=name;
    	
    	return this;
    }

    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#getTotalQuantity()
	 */
    @Override
	public Volume getTotalQuantity() {
        return this.theDrinksTotalQuantity;
    }

    /* (non-Javadoc)
	 * @see drinkerdiary.Core.Drink#setTotalQuantity(drinkerdiary.Core.Volume)
	 */
    @Override
	public DrinkImpl setTotalQuantity(Volume q) {
    	if(q==null)
    		throw new IllegalArgumentException("Volume must not be null!");
    	else
    		this.theDrinksTotalQuantity=q;
    	
        return this;
    }
}
