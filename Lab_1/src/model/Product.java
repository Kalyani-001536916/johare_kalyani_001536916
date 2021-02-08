/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kalyanijohare
 */
public class Product {
    private String name;
    private String desc;
    private String availNum;
    private String price;
    
    public String getName()
    {
    return name;
    }
    
    public void setName(String name)
    {
    this.name= name;
    }
    
    public String getDesc()
    {
    return desc;
    }
    
    public void setdesc(String desc)
    {
    this.desc = desc;
    }
    
    public String getAvailnum()
    {
    return availNum;
    }   
    
    public void setAvailNum(String availNum)
    {
    this.availNum = availNum;
    }
    
    public String getPrice()
    {
    return price;
    }
    
    public void setPrice(String price)
    {
    this.price = price;
    }
}
