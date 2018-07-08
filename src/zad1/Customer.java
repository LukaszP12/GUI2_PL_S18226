package zad1; 

public class Customer 
{
    private String name; 
    private double balance; 
    private ShoppingCart shoppingcart; 
   

    public Customer(String name,double balance) 
    {
        this.name = name; 
        this.balance = balance; 
        this.shoppingcart = new ShoppingCart(this); 
    }

    public ShoppingCart getShoppingCart() 
    {
        return shoppingcart; 
    }

    public double getCash() 
    {
        return balance; 
    }

//    public void pay(int amount) 
//    {
//        balance -= amount; 
//    }

    public void get(Flower flower)
    { 
        this.shoppingcart.add(flower);
    }

    public void pay() 
    {
        for (int i = this.shoppingcart.getFlowers().size() - 1; i >= 0 ; i--)
        {
            Flower fl = this.shoppingcart.getFlowers().get(i);
            if(PriceList.getInstance().getPrice(fl.getName()) == null )
                this.shoppingcart.getFlowers().remove(i);
        }
        double cost = 0;
        int i = 0;
        for (; i < this.shoppingcart.getFlowers().size(); i++)
        {
            Flower fl = this.shoppingcart.getFlowers().get(i);
            double price = fl.amount * PriceList.getInstance().getPrice(fl.getName());            
            
            if(cost + price > balance)                            
                break;            
            else
                cost+=price;
        }
        
        for (int k = this.shoppingcart.getFlowers().size() - 1; k >= i; k--)
        {
            this.shoppingcart.getFlowers().remove(k);
        }
        
        balance -= cost;
    }

    public void pack(Box box) 
    {
        box.getFlowers().addAll(this.getShoppingCart().getFlowers());
        this.getShoppingCart().getFlowers().clear();
            // TODO Auto-generated method stub
    }
    
    public String getName(){
        return name; 
    }

}
