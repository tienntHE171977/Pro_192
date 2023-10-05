
package slot10;

import java.util.Scanner;
import 

public class Item {
    protected int value;
    protected String creator;

    public Item() {
        value =0;
        creator = "";
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
    
    
    public void input(){
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop){
            try {
                System.out.print("Enter value: ");
                this.value = sc.nextInt();
                if(this.value == 0) {throw new EmptyValueException("Object must have some sort of inherent value.");}
                loop = false;
            }catch(EmptyValueException e){
                e.printStackTrace();
                loop = true;
            }
        }
        while (loop) {            
            try {
                
            } catch (Exception e) {
            }
        }
    }
    
}
