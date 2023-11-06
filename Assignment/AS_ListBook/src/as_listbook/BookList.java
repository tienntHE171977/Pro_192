/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_listbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class BookList {
    ArrayList<Book> t;

    // Constructor
    public BookList() {
        this.t = new ArrayList<Book>();
    }

    // Method to add book(s) to the end
    public void addBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books to add: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Code: ");
            String code = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Quantity: ");
            int qua = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Book book = new Book(code, title, qua, price);
            t.add(book);
            System.out.println("Book added successfully!");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        if (t.isEmpty()) {
            System.out.println("No books in the list.");
        } else {
            System.out.println("List of all books:");
            for (Book book : t) {
                System.out.println(book);
            }
        }
    }

    // Method to search a book by code
    public void searchBookByCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the code of the book to search: ");
        String code = scanner.nextLine();

        int index = findBook(code);
        if (index == -1) {
            System.out.println("Book not found.");
        } else {
            Book book = t.get(index);
            System.out.println("Book details:");
            System.out.println(book);
        }
    }

    // Method to update a book's price by code
    public void updateBookPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the code of the book to update: ");
        String code = scanner.nextLine();

        int index = findBook(code);
        if (index == -1) {
            System.out.println("Book not found.");
        } else {
            Book book = t.get(index);
            System.out.print("Enter the new price: ");
            double price = scanner.nextDouble();
            book.setPrice(price);
            System.out.println("Price updated successfully!");
        }
    }

    // Method to find the position of the first maximum price value in the list
    public int findMaxPrice() {
        if (t.isEmpty()) {
            return -1;
        } else {
            int maxIndex = 0;
            double maxPrice = t.get(0).getPrice();
            for (int i = 1; i < t.size(); i++) {
                double price = t.get(i).getPrice();
                if (price > maxPrice) {
                    maxIndex = i;
                    maxPrice = price;
                }
            }
            return maxIndex;
        }
    }

    // Method to sort the list ascendingly by code
    public void sortListByCode() {
        Collections.sort(t, (book1, book2) -> book1.getCode().compareTo(book2.getCode()));
        System.out.println("List sorted successfully!");
    }
    
    // Method to remove a book by code
    public void removeBookByCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the code of the book to remove: ");
        String code = scanner.nextLine();

        int index = findBook(code);
        if (index == -1) {
            System.out.println("Book not found.");
        } else {
            t.remove(index);
            System.out.println("Book removed successfully!");
        }
    }
    // Helper method to find a book by code
    private int findBook(String code) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }
    // Method to load data from file
    public void loadDataFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename to load data from: ");
        String filename = scanner.nextLine();

        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);

        t.clear(); // Remove all existing books

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] tokens = line.split(",");

            String code = tokens[0].trim();
            String title = tokens[1].trim();
            int qua = Integer.parseInt(tokens[2].trim());
            double price = Double.parseDouble(tokens[3].trim());

            Book book = new Book(code, title, qua, price);
            t.add(book);
        }

        fileScanner.close();
        System.out.println("Data loaded successfully!");
    }

    
    
}
