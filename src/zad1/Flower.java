package zad1; 

abstract public class Flower 
{
    protected int amount; 	
    protected String colour; 
    protected String name; 

    public int getAmount()
    {
        return amount;
    }

    public String getColour()
    {
        return colour;
    }

    public String getName()
    {
        return name;
    }
        
    public Flower(int amount,String colour,String name)
    {
        this.amount = amount; 
        this.colour = colour;
        this.name = name;
    }

    @Override
    public String toString()
    {
        Double price =  PriceList.getInstance().getPrice(name);
        String out = name + ", kolor: " + colour + " ilość " + amount 
                + " cena " + (price == null ? "brak ceny" : price);
        return out; 
    }
        
}


