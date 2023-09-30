/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author FPT
 */
public class SpecBrick extends Brick{
    protected int color;

    public SpecBrick() {
        super();
    }

    public SpecBrick(String place, int price, int color){
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+ color ;
    }
    public void setData(){
        super.setPlace(place.substring(0,2)+"BCA"+place.substring(2));
    }

    public int getVolume() {
        if(color>7) {return price + 9;
        }else{
            return price +6;
        }
    }   
    
}
