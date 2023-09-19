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
public class Workshop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of rows: ");
        int hang = sc.nextInt();
        System.out.print("Enter nubers of columns: ");
        int cot = sc.nextInt();
        int[][] matrix = new int[hang][cot];
        System.out.println("Enter the matrix:");
        for(int i=0 ;i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.print("m[" + i + "][" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for(int i=0; i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum =0;
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                sum += matrix[i][j];
            }
        }
        double trungbinh = (double)sum / (hang * cot);
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ trungbinh);
    }
    
}
