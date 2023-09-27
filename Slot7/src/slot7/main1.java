/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot7;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
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
                // Test toString()
                System.out.println("OUTPUT:");
                System.out.println();
                System.out.println(robot.toString());
                System.out.println(specRobot.toString());
                break;
            case 2:
                // Test setData()
                specRobot.setData(step);
                System.out.println("Label after setData: " + specRobot.getLabel());
                break;
            case 3:
                // Test getValue()
                int value = specRobot.getValue(step);
                System.out.println("OUTPUT:");
                System.out.println("Value: " + value);
                break;
            default:
                System.out.println("Invalid choice.");
        }
}
}
