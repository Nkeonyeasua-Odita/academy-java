import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display product options
        System.out.println("Available products:");
        System.out.println("1. Chips - $1.50");
        System.out.println("2. Soda - $2.00");
        System.out.println("3. Chocolate - $1.75");
        System.out.println("4. Gum - $0.50");

        // Get user choice
        System.out.print("Choose a product by entering the corresponding number: ");
       
        double productChoice = scanner.nextDouble();//case
        System.out.print("Input amount you have to pay ");
         double payment = scanner.nextDouble();
         
         double price = 0;

        // Use a switch statement to handle product selection
        switch (productChoice) {
            case 1:
                price = 1.50;
                System.out.println("You chose Chips.");
                break;
            case 2:
                price = 2.00;
                System.out.println("You chose Soda.");
                break;
            case 3:
                price = 1.75;
                System.out.println("You chose Chocolate.");
                break;
            case 4:
                price = 0.50;
                System.out.println("You chose Gum.");
                break;
            default:
                System.out.println("Invalid selection.");
                return;
        }
        
        if (payment == price) {
            System.out.printf("Thank you! Your change is: ");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
