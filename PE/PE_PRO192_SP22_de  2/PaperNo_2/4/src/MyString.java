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
        String[] arr = str.split("\\s+");
        int cnt = 0;
        for (String x : arr) {
            for (char y : x.toCharArray()) {
                if (Character.isDigit(y) && y % 2 == 1) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }

    public boolean checkStr(String str) {
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            t += str.charAt(i);
        }
        return t.equals(str);
    }

    @Override
    public String f2(String str) {
        StringBuilder sb = new StringBuilder(str);
        String[] arr = str.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (checkStr(arr[i])) {
                int index = sb.indexOf(arr[i]);
                sb.replace(index, index + arr[i].length(), "XX");
                break;
            }
        }
        return sb.toString();
    }

}
