/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public abstract class Organization {
    protected int size;
    abstract public void communicateByTool();
    public Organization(){
    }
    public Organization(int size) {
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    @Override
    public String toString() {
        return "the organization's size is" + this.size;
    }
}