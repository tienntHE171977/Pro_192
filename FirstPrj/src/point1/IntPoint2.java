/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point1;
public class IntPoint2 {
   int x=7, y=3; 
   public IntPoint2(){
       output();
       x=100;
       y=1000;
       output();
   }
    public IntPoint2(int x, int y) {
        this.x = x;
        this.y = y;
        output();
    }
    public void output(){
        String s= "[" + x + "," + y + "]";
        System.out.println(s);
    }
}
