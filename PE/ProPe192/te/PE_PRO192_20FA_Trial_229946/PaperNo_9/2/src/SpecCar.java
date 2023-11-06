/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price,int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+","+ type ;
    }
    public void setData(){
        super.setMaker( "XZ"+ super.getMaker());
        super.setPrice(super.getPrice()+20);
    }
    public int getValue(){
        int result = 0;
        if(type < 7){
            result = super.getPrice()+10;
        }else{
            result = super.getPrice()+15;
        }
        return result;
    }
}
