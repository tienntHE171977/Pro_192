
public class Carp {
    private String pond;
    private int size;

    public Carp() {
    }

    public Carp(String pond, int size) {
        this.pond = pond;
        this.size = size;
    }

    public String getPond() {
        return pond=pond.substring(0, 2).toUpperCase()+pond.substring(2);
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
