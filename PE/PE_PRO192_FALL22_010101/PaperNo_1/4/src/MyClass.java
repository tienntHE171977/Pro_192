/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MyClass implements IProcess {

    @Override
    public long factorial(int i) {
        int p = 1;
        for(int n = 1; n <= i; n++ )
        {
            p*=n;
        }
        return p;
    }

    @Override
    public String checkString(String string) {
        String c = new String("HD"); // tao 1 string con de check 2 ki tu dau
        String result = new String("Fail"); // result mac dinh la fail
        if(string.length() == 8) // neu string = 8 moi chay
        {
            if( string.substring(0,2).equals(c) || string.substring(0,2).equals(c.toLowerCase()) ) // string bang c hoac c dang lowercase
            {
                //check cac phan tu sau co phai digit k
                if(Character.isDigit(string.charAt(2)) && Character.isDigit(string.charAt(3)) && Character.isDigit(string.charAt(4)) && Character.isDigit(string.charAt(5)) && Character.isDigit(string.charAt(6))&& Character.isDigit(string.charAt(7)))  
                {
                    result = "Success";
                }
            }
        }
        return result;
    }
    
}

    
    

