/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Main1 {
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String Maker;int v1; int Volum;
int tc;
        System.out.println();
        System.out.println("Ebter Maker:");
        Maker = sc.nextLine();
        System.out.println("Enter Volum:");
        Volum = sc.nextInt(); sc.nextLine();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test setVolum()");
        
        System.out.println("Enter TC(1,2,3):");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT: ");
        
        Bottle a = new Bottle(Maker, Volum);
        System.out.println(a);
        if(tc == 2){
            System.out.print("Enter new volume:");
            v1 = sc.nextInt(); sc.nextLine();
            a.getVolume();
        }  
        switch(tc){
            case 1:
                String u = a.getMaker();
                System.out.printf("%s\r\n", u);break;
            case 2:
                int v = a.getVolume();
                System.out.printf("%d\r\n", v); break;
            default:
                 return;
        }
      System.out.println();
    }
}
