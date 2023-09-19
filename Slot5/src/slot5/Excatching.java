/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot5;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Excatching {
    public static int inputInteger() throws Exception {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        int n = 0;
        do{
            try{
                System.out.println("Enter a whole number: ");
                n = Integer.parseInt(in.nextLine());
                if(n<10|| n>50) throw new Exception();
                cont = false;
            } catch (Exception e){
            System.out.println("Required integer!");
           }
        }while (cont == true);
        return n;
            
        
    }
    public static void main(String[] args) throws Exception {
        int n= inputInteger();
        System.out.print("number:"+n);
    }
}
