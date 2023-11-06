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

    @Override
    public int f1(String str) {
        int count= 0;
       str = str.toLowerCase();
       String words[] = str.split("\\S");
        for (String word : words) {
            if( word.endsWith("m")|| word.endsWith("n")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String result = "";
        String words[]= str.split("\\s");
        int max = words[0].length();
        int pos = 0;
        for(int i =0; i< str.length(); i++){
            if(words[i].length() > max){
                max = words[i].length();
                pos = i;
            }
        }
        result = new StringBuilder(words[pos]).reverse().toString();
        str = str.replaceFirst(words[pos], result);
        return str;
    }
    
}
