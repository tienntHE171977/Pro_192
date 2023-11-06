    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecCar extends Car {
    private int type;
    
public SpecCar(){

}
public SpecCar(String maker, int price, int type){
    super(maker,price);
    this.type=type;
}

    @Override
    public String toString() {
        return super.getMaker() + "," + super.getPrice() + "," + this.type;
    }
    public void setData()
    {
        setMaker("XZ" + getMaker());
        setPrice(getPrice()+20);
    }
    public int getValue(){
        int inc;

        if (this.type >=7 )inc = 15;
        else {
            inc = 10;  
                    }
        return super.getPrice() + inc;
    }
}