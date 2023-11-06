
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String arr[] = str.split(" ");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            String arr1[] = arr[i].split("");
            s += arr1[arr1.length - 1];
            if (s.matches("[0-9]")) {
                count++;
                s = "";
            } else {
                s = "";
            }
        }
        return count;
    }

    /*int count = 0;
 String arr[] = str.split(" ");
     for (int i = 0; i < arr.length; i++) {
    if(arr[i].endwiths("2")||arr[i].endwith("4")){
    count ++;
    }
    return count;
     */
    
    
    @Override
    public String f2(String str) {
         String arr[] = str.split(" ");
         ArrayList<String> listString = new ArrayList<>();
         for (int i = 0; i < arr.length; i++) {
            listString.add(arr[i]);
        }
         Collections.sort(listString.subList(listString.size() - 4, listString.size()));
         String result = "";
         for (int i = 0; i < listString.size(); i++) {
             result = result+ listString.get(i) + " " ; 
        }
         return result;
    }

}
