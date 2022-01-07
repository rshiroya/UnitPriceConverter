
/**
 * This program is a Unit Price converter. The user would be given options to enter the price and the weight of the item in pounds.
 * which then the program will convert the value of pounds in ounces and then calculate the price pased on the value provided by the user.
 * As for this class is hqas two constructor methods one sets the value to 0 except the constant and another one calculates the value.
 * There are two set methods and five get methods in this class.
 * @author R. Shiroya
 * @version 02-12-2020
 */
public class UnitPriceConverter
{
    // declaring the variables.
    private double priceOfItem;
    private double weightInPounds;
    private double weightInOunces;
    private double pricePerPound;
    private double pricePerOunce;
    //declaring the constants
    private final double OUNCES_PER_POUND = 16 ;

    /**
     * The default no args constructor allows the construction of UnitPriceConverter when the details are not knoewn yet.
     * The main aim is to set the initial value to the variables in this case 0
     * 
     */
    public UnitPriceConverter()
    {
        // initialise variables to 0
        priceOfItem = 0;
        weightInPounds = 0;
        weightInOunces = 0;
        pricePerPound = 0;
        pricePerOunce = 0;
        
    }

    /**
     * A constructor to do the calculations and set the parameters.
     * @param double, itemPrice to set the price of the item.
     * @param double, weightPounds, to set the weight of  the item in pounds.
     * 
     */
    public UnitPriceConverter(double itemPrice, double weightPounds)
    {
        priceOfItem = itemPrice;
        weightInPounds = weightPounds;
        weightInOunces = weightPounds * OUNCES_PER_POUND;
        pricePerPound = itemPrice * weightPounds;
        pricePerOunce = itemPrice * weightInOunces;
    }
    /**
     * A set method to set the price of the item/.
     * @param double, to set the price of the item.
     */
    public void setItemPrice(double price)
    {
        priceOfItem = price;
        pricePerOunce = price * weightInPounds * OUNCES_PER_POUND;
    }
    /**
     * A set method to set the weight of the item in pounds
     * @param double, to set the weight of the item.
     */
    public void setPoundsWeight(double weight)
    {
        weightInPounds = weight;
        weightInOunces = weight * OUNCES_PER_POUND;
    }
    
    /**
     * a get method to return the value
     * @return double, to return the price of the item.
     */
    public double getItemPrice()
    {
        return priceOfItem;
    }
    /**
     * a get method to return the value.\
     * @return double, to return the weight of the item in pounds.
     */
    public double getWeightPounds()
    {
        return weightInPounds;
    }
    /**
     * a get method to return the value.
     * @return double, to return the weight of the item in ounces.
     */
    public double getWeightOunces()
    {
        return weightInOunces;
    }
    /**
     * a get method to return the value.
     * @return double, to return the price of the item in pounds.
     */
    public double getPricePound()
    {
        return pricePerPound;
    }
    /**
     * a get method to return the value.
     * @return double, to return the price of the item in ounces.
     */
    public double getPriceOunce()
    {
        return pricePerOunce;
    }
    /**
     * A string method to print all values.
     * 
     */
    public String toString()
    {
        weightInOunces = weightInPounds * OUNCES_PER_POUND;
        pricePerOunce = priceOfItem * weightInOunces;
        pricePerPound = priceOfItem * weightInPounds;
        return "\n" + "Price of the Item: " + priceOfItem + "\n"
        + "Weight in Pounds: " + weightInPounds + "\n"
        + "Weight in Ounces: " + weightInOunces + "\n"
        + "Price Per Pound: " + pricePerPound + "\n"
        + "Price Per Ounce: " + pricePerOunce + "\n";
    }
}
