/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ColorTivi extends Tivi{
   private int serie;

    public ColorTivi() {
    }

    public ColorTivi( String type ,int serie,double price) {
        super(type, price);
        this.serie = serie;
    }

    @Override
    public String toString() {
        return super.getType()+" "+serie +" "+ super.getPrice() ;
    }
    public double getPrice(){
        double newPrice = 0;
        if(serie>3000){
            newPrice = super.getPrice() - super.getPrice()*10/100;
        }else{
            newPrice = super.getPrice();
        }
        return newPrice;
    }
    

  
 
    
}
