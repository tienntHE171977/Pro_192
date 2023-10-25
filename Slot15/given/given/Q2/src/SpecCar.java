/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar( String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +","+ type; 
    }

    public void setData() {
        setMaker("XY"+ getMaker());
        this.price += 20;
    }
    public int getValue(){
        int inc =(type<7)?10:15;
        return getPrice() + inc;
    }
}
