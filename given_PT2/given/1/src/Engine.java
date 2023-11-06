
public class Engine {
    private String designer;
    private int power;

    public Engine() {
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
         char a= designer.charAt(0);
         char b = Character.toLowerCase(a);
         String s = b + this.designer.substring(1,3);
        return s;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
}
