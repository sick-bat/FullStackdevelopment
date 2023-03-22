import java.util.*;
public class Menu {
    public void inputMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1.  Rename");
            System.out.println("2.  Copy");
            System.out.println("3.  List Content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Renaming option selected");
                    break;
                case 2:
                    System.out.println("Copy");
                    break;
                case 3:
                    System.out.println("Listing contents");
                    break;
                case 4:
                    System.out.println("Exiting menu");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
    }
    
}
