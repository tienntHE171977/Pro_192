/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxPkg;

import ractPkg.Rectangle;

/**
 *
 * @author FPT
 */
public class Box extends Rectangle{
    int height;
    protected int price;
    private int weight;
    void setSize (int i, int w, int h){
        super.setSize(i,w);
        height = h>0? h: 0;
    }
    int volume (){
        return lenght*width*height;
    }
}
