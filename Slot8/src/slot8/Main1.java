/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot8;
import java.util.*;
import java.io.*;
/**
 *
 * @author FPT
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maker of the bottle: ");
        String maker = scanner.nextLine();

        System.out.print("Enter the volume of the bottle: ");
        int volume = scanner.nextInt();

        // Creating a Bottle object with user-inputted values
        Bottle myBottle = new Bottle(maker, volume);

        // Printing the bottle's information
        System.out.println("Maker: " + myBottle.getMaker());
        System.out.println("Volume: " + myBottle.getVolume());
    }
}
