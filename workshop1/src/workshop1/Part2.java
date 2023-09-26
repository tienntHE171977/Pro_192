/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number 1: ");
        float num1 = scanner.nextFloat();

        System.out.print("Input the number 2: ");
        float num2 = scanner.nextFloat();

        System.out.print("Input the operator: ");
        char operator = scanner.next().charAt(0);

        float result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        }

        System.out.println("The result of " + num1 + " " + operator + " " + num2 + " = " + result);
    }
}

