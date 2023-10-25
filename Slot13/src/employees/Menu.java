
package employees;
import java.util.Vector;
import java.util.Scanner;

public class Menu extends Vector<String> {
    public Menu() {
        super();
    }

    void addMenuItem(String item) {
        this.add(item);
    }

    int getUserChoice() {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        for (int i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + ". " + this.get(i));
        }

        while (choice < 1 || choice > this.size()) {
            System.out.print("Enter your choice (1-" + this.size() + "): ");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        return choice;
    }

}
