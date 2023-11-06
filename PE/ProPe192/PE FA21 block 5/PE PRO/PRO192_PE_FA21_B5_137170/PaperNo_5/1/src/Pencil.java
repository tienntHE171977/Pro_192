/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Pencil {
    private String owner;
    private int color;
public Pencil(){
    
}   
public Pencil(String owner, int color){
    this.owner = owner;
    this.color = color;
}

    public String getOwner() {
        return owner.toLowerCase();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
