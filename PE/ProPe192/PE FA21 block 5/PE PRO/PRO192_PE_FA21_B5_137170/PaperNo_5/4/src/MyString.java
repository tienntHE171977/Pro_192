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
    public int f1(String str) {
    int count = 0;
    String[]s = str.split(" ");
    for(int i = 0; i < s.length; i++){
        if(Character.isDigit(s[i].charAt(s[i].length()-1)))
            count++;
    }
    return count;
    }

    @Override
    public String f2(String str) {
        // tách chuỗi thành words
        String[] s = str.split("\\s");
        //xét nguyên 4 chữ cuối, chạy từ vị trí thứ 4 đến cuối
        for( int i = s.length - 4 ; i < s.length ; i++)
        {
            //chạy từ vị trí thứ 3 vì thứ 4 đã chạy rồi
            for(int j = i+1; j < s.length; j++){
                //sắp xếp lại vị trí của chuỗi
            if(( s[i].compareTo(s[j] )> 0)) { 
                String temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }
        //nối chuỗi
        String result = "";
        for(int i = 0; i < s.length; i++)
        {
            result += s[i]+ " ";
        }
        
        return result.trim();
}
}
