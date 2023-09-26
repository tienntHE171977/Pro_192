/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author FPT
 */
public class Part3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter the student names (one name per line, enter 'done' to finish):");

        // Đọc tên sinh viên cho đến khi người dùng nhập "done"
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            studentNames.add(input);
        }

        System.out.println("Uppercase Student Names:");

        // Chuyển đổi và in tên  chữ hoa
        for (String name : studentNames) {
            String uppercaseName = name.toUpperCase();
            System.out.println(uppercaseName);
        }
    }
}


