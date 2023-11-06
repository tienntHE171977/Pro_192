
import java.util.HashSet;
import java.util.Set;

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
    private boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
            return false;
        }
    }
    return true;
}

    @Override
    public int f1(String str) {
        int sum = 0;

        // Tách chuỗi thành các từ bằng khoảng trắng
        String[] words = str.split("\\s+");

        for (String word : words) {
            // Kiểm tra điều kiện: ít nhất hai ký tự và không phải là chuỗi đối xứng
            if (word.length() >= 2 && !isPalindrome(word)) {
                sum += word.length();
            }
        }

        return sum;
    
                
    }

    @Override
    public String f2(String str) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        return result.toString();
    }
    
    
}
