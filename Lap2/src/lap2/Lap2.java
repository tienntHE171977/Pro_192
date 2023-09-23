/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Lap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            try{
                System.out.println("Enter the number:");
                String input = sc.nextLine();
                n = Integer.parseInt(input);
                if(n<1){
                    System.out.println("The number is invalid");
                }else{
                    System.out.println("The number is "+ n); break;
                }
            }catch(NumberFormatException e) {
                System.out.println("The number is invalid");
            }
        }while(true);
         

    }
    
}
