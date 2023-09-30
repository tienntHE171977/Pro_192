/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Place; int Price; int Color = 0;
int tc;
        System.out.println();
        System.out.println("Ebter place:");
        Place = sc.nextLine();
        System.out.println("Enter price:");
        Price = sc.nextInt(); sc.nextLine();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test setVolum()");
        
        System.out.println("Enter TC(1,2,3):");
        tc = sc.nextInt(); sc.nextLine();
        System.out.println("OUTPUT: ");
        switch(tc){
            case 1:{
                Brick al1 = new Brick(Place, Price);
                System.out.println(al1);
                SpecBrick al2 = new SpecBrick(Place, Price, Color);
                System.out.println(al2);
            }
            case 2:{
                SpecBrick b = new SpecBrick(Place, Price, Color);
                b.setData();
                
                String v = b.getPlace();
                int k = b.getPrice();
                System.out.printf("%s, %d\n", v,k);
                break;
            }
            case 3:{
                SpecBrick b2 = new SpecBrick(Place, Price, Color);
                int v2 = b2.getVolume();
                System.out.printf("%d\n", v2);
                break;
            }
            
        }
        System.out.println();
    }
}
