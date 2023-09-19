/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot5;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author FPT
 */
public class Arryandmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter the number of elements:");
        int n= sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the arrays:");
        for(int i =0; i<n;i++)
                arr[i]= sc.nextInt();
        
        System.out.println("All elements in the array:");
        for(int num : arr)
                System.out.println(num +" ");
        
        Arrays.sort(arr);
        System.out.println("Sorted numbers in ascending order: ");
        for(int num : arr) System.out.print(num + " ");
        
        int max = gtMax(arr);
            System.out.println("Max la :" + max);
    }catch(Exception e){
            System.out.println("Không phải giá trị mong muốn, vui lòng nhập số!");
        }
        System.out.println("");
    }
    public static int gtMax(int[] arr) {
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
