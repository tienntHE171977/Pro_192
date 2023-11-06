
public class SpecCarpet extends Carpet{
    private int color;

    public SpecCarpet(int color) {
        this.color = color;
    }

    public SpecCarpet(String maker, int size, int color) {
        super(maker, size);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
   public void setData(){
       super.setMaker(super.getMaker().substring(0, 3)+"HOA"+super.getMaker().substring(5));
   }
   public int getValue(){
       if (super.getSize()<6) {
           return color+=7;
       }
       return color+=5;
   }
    @Override
    public String toString() {
        return super.toString() + "," + color ;
    }
    
}
