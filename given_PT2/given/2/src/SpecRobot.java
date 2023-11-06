/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
    }

    public SpecRobot( String label, int type,int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.getLabel()+","+super.getType()+","+ step ;
    }
    public void setData(){
        String a = super.getLabel().substring(0, 1) + step + super.getLabel().substring(1);
        
         super.setLabel(a);
    }
    public boolean check(String a){
        for(int i=0; i< super.getLabel().length();i++){
            if(super.getLabel().charAt(i)=='A'){
            return true;
            }
        
        }
        return false;
    }
    public int getValue(){
        if(super.getType()< 3 && check(super.getLabel())== true){
            return this.step;
        }else
        return this.step + 2;
    } 
   
}
