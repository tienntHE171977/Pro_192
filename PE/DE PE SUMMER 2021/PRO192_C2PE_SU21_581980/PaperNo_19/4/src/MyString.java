/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class MyString implements IString{
    private int check(char x){
        if(x == '2') return 2;
        if(x == '4') return 4;
        if(x == '6') return 6;
        if(x == '8') return 8;
        return -1;
        
    }
    @Override
    public int f1(String str) {
        int sum= 0;
        for(int i =0; i< str.length();i++){
            if(check(str.charAt(i)) != -1){
                sum += check(str.charAt(i));
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        String rc = "";
         for(int i=0;i<str.length();i++){
             if(String.valueOf(str.charAt(i)).matches("^[^0-9A-Z]+$")){
                 continue;
             }
             rc += str.charAt(i);
         }
        return rc;
    }
    
}
