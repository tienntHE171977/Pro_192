/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guitar;

/**
 *
 * @author FPT
 */
public class Guitar {
    private String serialNumber;
    private int price;
    private String builder, model, backWood, topWood;
    
    public Guitar() {
        serialNumber = null;
        price = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if(serialNumber != null && !serialNumber.isEmpty()){
            this.serialNumber = serialNumber;
        }else{
            
            this.serialNumber = null;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public void createSound(){
        System.out.println("serialNumber: " + getSerialNumber());
        System.out.println("price: " + getPrice());
        System.out.println("builder: " + getBuilder());
        System.out.println("model: " + getModel());
        System.out.println("backWood: " + getBackWood());
        System.out.println("topWood: " + getTopWood());
    }
    
}
