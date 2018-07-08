/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1; 

import java.util.ArrayList;

/**
 *
 * @author Lukasz Piwowarski s18226
 */
public abstract class ContainerBase
{
    private ArrayList<Flower> lista = new ArrayList<>(); 	
    private Customer owner; 

    public ContainerBase(Customer owner) 
    {                
        lista = new ArrayList<>();
        this.owner = owner; 
    }

    void add(Flower flower)
    { 
        this.lista.add(flower);
    }	
    public ArrayList<Flower> getFlowers()
    {
        return lista;
    }
    
    //przeciazeenie toString
    @Override
    public String toString()
    {
        String out = "Wózek właściciel " + owner.getName();
        if( lista.isEmpty())
        {
            out+=" -- pusto";
        }
        for(int i=0;i<lista.size(); i++)
        {
            out += System.lineSeparator();
            out += lista.get(i).toString();          
        }
        
        return out;
    }
}
