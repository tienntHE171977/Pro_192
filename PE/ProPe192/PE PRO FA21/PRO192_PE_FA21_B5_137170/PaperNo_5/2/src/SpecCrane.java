/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class SpecCrane extends Crane{
    private int radius;

    public SpecCrane() {
    }

    public SpecCrane(String maker, int type,int radius) {
        super(maker, type);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+","+ radius ;
    }
    public void setData(){
        super.setMaker("BA" + super.getMaker());
    }
    public int getValue(){
        int x = 0;
        if(radius > 10){
            x = super.getType() * 3;
        }else{
            x = super.getType() * 2;
        }
        return x;
    }
}
