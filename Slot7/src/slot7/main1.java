
package slot7;

import java.util.Scanner;


public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho SpecRobot
        System.out.print("Enter label: ");
        String label = scanner.nextLine();
        
        System.out.print("Enter type: ");
        int type = scanner.nextInt();
        
        System.out.print("Enter step: ");
        int step = scanner.nextInt();
        
        SpecRobot specRobot = new SpecRobot(label, step, type);
        Robot robot = new Robot(label, type);

        // Hiển thị menu và lựa chọn thử nghiệm
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1, 2, 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                
                System.out.println("OUTPUT:");
                System.out.println();
                System.out.println(robot.toString());
                System.out.println(specRobot.toString());
                break;
            case 2:
                System.out.println("OUTPUT:");
                System.out.println();
                specRobot.setData();
                System.out.println(specRobot.getLabel() + "," + specRobot.getType());
                break;
            case 3:
                
                int value = specRobot.getValue();
                System.out.println("OUTPUT:");
                System.out.println(value);
                break;
            default:
                System.out.println("Invalid choice.");
        }
}
}
