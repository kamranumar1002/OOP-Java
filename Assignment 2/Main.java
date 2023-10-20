import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to our System");

        Scanner input = new Scanner(System.in);
        Options option = new Options();
        int choice = 0;
        while(choice > -1){
            System.out.println("Type 1 to add product\nType 2 to remove a product\nType 3 to search and display product(s)\nType 4 to update a product\nType 5 to display a report\nEnter -1 to exit the system");
            try {
                choice = input.nextInt();
                if(choice == -1){
                    System.out.println("Thanks for using our Software");
                    break;
                }
                option.displayOptionDetails(choice);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                input.nextLine();
                continue;
            }
        }

        
    }
}