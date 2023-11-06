/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++ )
        {
           char c = string.charAt(i);
           if(Character.isDigit(c)){
               int numb = Integer.parseInt("" + c);
               if(isprime(numb)== true){
                   count++;
               }
           }   
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String result = " ";
        String[] words = string.split("\\s");
        for(int i = words.length -1; i >= 0; i--){
            result += " " + words[i];
        }
        return result.trim();
        }
private boolean isprime(int numb){
    if(numb < 2) return false;
    if (numb == 2) return true;
    else
        for(int i = 2; i <= Math.sqrt(numb); i++){
            if(numb %i == 0) return false;
        }
    return true;
}

}
