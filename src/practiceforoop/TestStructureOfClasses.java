package practiceforoop;

import java.util.Scanner;

public class TestStructureOfClasses {

    public static void main(String[] args) {
        System.out.println("Create an instance of Chief");
        String chiefName;
        Scanner in = new Scanner(System.in);
        System.out.print("Input Chief's name: ");
        chiefName = in.nextLine();
        Chief chief = new Chief(chiefName);
        
        System.out.println("Checking work of the created chief");
        chief.doWork();
        
        System.out.println("Checking inheritance");
        System.out.println("Chief work's in " + chief.getOffice(1) + "\n");
        
        System.out.println("Checking work of the interface");
        int chiefSalary;
        chiefSalary = chief.getSalary();
        System.out.println(chiefSalary + "у.е.");
    }
    
}
