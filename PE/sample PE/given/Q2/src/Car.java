/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Car {
    private String maker;
    private int price;
public Car(){
    
}    
public Car(String maker, int price){
    this.maker = maker;
    this.price = price;
}    

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  this.maker + ","  + this.price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
