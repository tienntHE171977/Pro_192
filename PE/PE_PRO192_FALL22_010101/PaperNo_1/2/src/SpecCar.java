/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class SpecCar extends Car{
    private int warranty;

    public SpecCar() {
    }
    
    public SpecCar(String name,double price,int warranty){
        super(name,price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.getName() + "," + super.getPrice() + "," + this.warranty;
    }
    public int getWarranty (){
        if(super.getName().equals("AUDI"))
        {
           return warranty + 5;
            
    }
        else return warranty + 2;
    
    }
    
    public void setQuarranty(int warranty)
    {
        this.warranty = warranty;
    }
    
}
