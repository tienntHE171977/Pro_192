/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_listbook;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Main {
    


    public static void main(String[] args) throws FileNotFoundException {
        BookList bl = new BookList();
        Scanner sc = new Scanner(System.in);
        int choice,i;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input & add book(s) to the end.");
            System.out.println("2. Display all books.");
            System.out.println("3. Search a book for given code.");
            System.out.println("4. Update the book’s price for given code.");
            System.out.println("5. Find the (first) max price value.");
            System.out.println("6. Sort the list ascendingly by code.");
            System.out.println("7. Remove the book having given code.");
            System.out.println("8. Load data from file.");
            System.out.println("0. Exit.");

            System.out.print("    Your selection (0 -> 8): ");
            choice = sc.nextInt(); sc.nextLine();
            if(choice==0) break;

            switch (choice) {
                case 1:
                    bl.addBooks();
                    break;
                case 2:
                    bl.displayAllBooks();
                    break;
                case 3:
                    bl.searchBookByCode();
                    break;
                case 4:
                    bl.updateBookPrice();
                    break;
                case 5:
                    
                    i = bl.findMaxPrice();
                    System.out.println("Max is at the position " + i);
                    System.out.println(bl.t.get(i));
                    break;
                case 6:
                    bl.sortListByCode();
                    break;
                case 7:
                    bl.removeBookByCode();
                    break;
                case 8:
                    bl.loadDataFromFile();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        
        sc.close();
    }
}

