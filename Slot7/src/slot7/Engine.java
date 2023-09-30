package slot7;

import java.util.Scanner;

public class Engine {
    private String designer;
    private int power;

    // Default constructor
    public Engine() {
        this.designer = "";
        this.power = 0;
    }

    // Parameterized constructor
    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    // Getter for designer (modified)
    public String getDesigner() {
        if (designer.length() >= 3) {
            String firstThreeChars = designer.substring(0, 3).toLowerCase();
            
            return firstThreeChars;
        } else {
            return designer.toLowerCase();
        }
    }

    // Getter for power
    public int getPower() {
        return power;
    }

    // Setter for power
    public void setPower(int power) {
        this.power = power;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter designer: ");
        String designer = sc.next();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        Engine engine = new Engine(designer, power);

        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");
        System.out.print("Enter TC (1 or 2): ");
        int testCase = sc.nextInt();

        switch (testCase) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(engine.getDesigner());
                break;
            case 2:
                System.out.print("Enter new power: ");
                int newPower = sc.nextInt();
                engine.setPower(newPower);
                System.out.println("OUTPUT:");
                System.out.println(engine.getPower());
                break;
            default:
                System.out.println("Invalid test case.");
                break;
        }
    }
}
