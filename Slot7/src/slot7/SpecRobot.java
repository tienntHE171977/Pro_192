/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot7;
import java.util.Scanner;


public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
       super();
       step = 0;
    }
    public SpecRobot(String label,int step, int type) {
        super(label, type);
        this.step = step;
    }

    public void setData(int step) {
        if(super.getLabel().length()>= 2){
            String t1 = super.getLabel().substring(0, 1);
            String t2 = super.getLabel().substring(1);
            super.setLabel(t1 + step + t2);
        }
    }

    public int getValue(int step) {
        if(getType() < 3 && getLabel().contains("A")){
            return step;
        }else{
            return step + 2;
        }
            
            
    }

    @Override
    public String toString() {
        return super.toString()+ "," + step;
    }
    
   
    
}
