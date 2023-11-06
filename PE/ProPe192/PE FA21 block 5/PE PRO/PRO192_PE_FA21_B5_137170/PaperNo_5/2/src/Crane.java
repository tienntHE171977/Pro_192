/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Crane {
    private String maker;
    private int type;
public Crane(){
    
}   
public Crane(String maker, int type){
    this.maker = maker;
    this.type = type;
}

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.maker + "," + this.type;
    }
    

}
