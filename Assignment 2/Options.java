import java.util.*;

public class Options {
    private String id;
    Inventory inventory = new Inventory(100);

    public void displayOptionDetails(int option){
            switch (option){
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                    option5();
                    break;
                default:
                    System.out.println("Enter a valid option");
            }

        }

    private void option1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to add a Laptop\nEnter 2 to add a Smartphone\nEnter 3 to add an AudioDevice\nEnter 4 to add seating\nEnter 5 to add a Table\nEnter 6 to add Groceries\nEnter 7 to return to Main Menu");
        int option = input.nextInt();
        switch (option) {
            case 1:
                if(inventory.addProduct(Laptops.addLaptop()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            case 2:
                if(inventory.addProduct(Smartphones.addSmartphone()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            case 3:
                if(inventory.addProduct(AudioDevices.addAudioDevice()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            case 4:
                if(inventory.addProduct(Seatings.addSeating()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            case 5:
                if(inventory.addProduct(Tables.addTable()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            case 6:
                if(inventory.addProduct(Groceries.addGrocery()))
                    System.out.println("Product added successfully\n");
                else{
                    System.out.println("Unable to add product\n");
                }
                break;
            default:
                System.out.println("Choose valid options\n");
        }
    }
    private void option2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of the product which you want to remove:");
        id = input.next();
        if(inventory.removeProduct(id))
            System.out.println("Product removed successfully\n");
        else{
            System.out.println("Unable to remove product\n");
        }
    }
    private void option3(){
        System.out.println("Enter 1 to search products by specific category\nEnter 2 to search product by Id\nEnter 3 to search product by name\nEnter 4 to return to Main Menu");
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int show = input.nextInt();
        switch (show){
            case 1:
                System.out.println("Enter 1 for Electronics\nEnter 2 for Furniture\nEnter 3 for Grocerries: ");
                int catId = input.nextInt();
                inventory.searchProductByCategory(catId);
                break;
            case 2:
                System.out.println("Enter id of the product which you want to search:");
                id = inputStr.next();
                inventory.searchProduct(id);
                break;
            case 3:
                System.out.println("Enter name of the product which you want to search:");
                String name = inputStr.next();
                inventory.searchProductByName(name);
                break;
            default:
                System.out.println("Choose valid options\n");
        
        System.out.println("Enter id of the product which you want to retrieve:");
        id = input.next();
        System.out.println(inventory.retrieveProduct(id));
        
    }
}
    private void option4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id of product which you want to update:");
        id = input.nextLine();
        System.out.println("Enter 1 to change price\nEnter 2 to change stockQuantity");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter new Price:");
                double price = input.nextDouble();
                System.out.println(inventory.updateProduct(id,price));
                break;
            case 2:
                System.out.println("Enter new stock Quantity");
                int stocks = input.nextInt();
                System.out.println(inventory.updateProduct(id,stocks));
                break;
            default:
                System.out.println("Choose a valid option\n");
        }
    }
    private void option5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to show report for a specific category\nEnter 2 to show report for all available products\nEnter 4 to return to Main Menu");
        int show = input.nextInt();
        switch (show){
            case 1:
                System.out.println("Enter 1 for Electronics:");
                System.out.println("Enter 2 for Furniture:");
                System.out.println("Enter 3 for Grocerries:");
                int catId = input.nextInt();
                inventory.displayReport(catId);
                break;
            case 2:
                inventory.displayReport();
                break;
            default:
                System.out.println("Choose valid options\n");
        }
    }
}
