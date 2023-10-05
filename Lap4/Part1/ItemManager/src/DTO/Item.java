
package DTO;
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input (){
        int check = 1;
        Scanner sc = new Scanner(System.in);
        do {
          
            try {
                    
                System.out.println("input value > 0: ");
                value = Integer.parseInt(sc.nextLine());
                System.out.println("input creator not empty: ");
                creator = sc.nextLine();
                if(value < 0 || creator.trim().isEmpty()) throw new Exception();
                check = 0;
                
            } catch (Exception e) {
                System.out.println("please input again");
                check = 1;
            }
        } while (check == 1);;
    }   
    public void output (){
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}
