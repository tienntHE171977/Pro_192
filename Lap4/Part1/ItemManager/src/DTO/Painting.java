
package DTO;
import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator,int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

   

    public void outputPainting() {
        super.output();
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("isWatercoulour " + isWatercolour);
        System.out.println("isFramed: " + isFramed);

    }

    public void inputPainting() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextInt();
        System.out.println("Input width");
        width = sc.nextInt();
        
    }
}
