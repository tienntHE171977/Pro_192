/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ractPkg;

/**
 *
 * @author FPT
 */
public class Rectangle {
    protected  int legth;
    private int width;
    public void setSize (int i, int w){
        legth = 1>0? i: 0;
        width = w>0? w: 0;
    }
}
