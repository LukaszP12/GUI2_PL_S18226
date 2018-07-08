package zad1; 
import java.util.HashMap;

public class PriceList
{
    // double Double
    private HashMap<String,Double> prices = new HashMap();
    
    private static PriceList instance = null;
    private PriceList()
    {        
    }
    
    public static PriceList getInstance()
    {
        if(instance == null)
        {
            instance = new PriceList();
        }
        return instance;
    }
    
    
    public void put(String name, double price){
        this.prices.put(name, price);
    }
    
    public Double getPrice(String name){
        return prices.get(name);
    }
    
    

}