/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecCrane extends Crane {
    private int radius;
public SpecCrane(){
    
}    
public SpecCrane(String maker, int type, int radius){
    super(maker, type);
    this.radius = radius;
}    

    @Override
    public String toString() {
        return super.getMaker() + "," + super.getType() + "," + this.radius;
    }
    public void setData(){
        setMaker("BA"+getMaker());
    }
    public int getValue(){
        int x;
        if(radius>10){
            x=getType()*3;
        }
        else {
            x=getType()*2;}
        return x;
    }

    
}
