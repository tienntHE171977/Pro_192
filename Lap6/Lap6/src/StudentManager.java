/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
public class StudentManager {
    public static void main(String[] args) {
        String[] options = {"Add new student","Search a student","Update name and mark","Remove a student","List All","Quit"};
        int choice = 0;
        StudentList list = new StudentList();
        do{
            System.out.println("\nStudent managing Program");
            choice = Menu.getChoice(options);
            switch(choice){
                case 1 : 
                    list.addStudent();
                    break;
                case 2 :
                    list.searchStudent();
                    break;
                case 3 :
                    list.updateStudent();
                    break;
                case 4 :
                    list.removeStudent();
                    break;
                case 5 :
                    list.printAll();
                    break;
                 default:System.out.println("End!");
            }
        }while(choice > 0 && choice < 6);
    }
}