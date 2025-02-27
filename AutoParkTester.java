import java.util.Scanner;

public class AutoParkTester {
    public static void main(String[] args) {
        AutoPark autoPark = new AutoPark("Revv-tastic Auto Oasis"); // Instantiates AutoPark
        autoPark.displayItems(); // Will display all the products in the inventory
        System.out.println("\nEnter a string to search ('quit' to stop):");


        Scanner userInput = new Scanner(System.in);
        String userStr = userInput.nextLine(); // This will store the input the user gave in the scanner so that it can be used later. The nextLine() method allows the whitespaces to be included in the input, so that we can have multiple words stores in userStr

        while (!userStr.strip().equalsIgnoreCase("quit")) { // The loop will be infinite until the user inputs quit
            if (autoPark.searchItem(userStr)) {
                System.out.println("There is a matching item available in our inventory.");
            } else {
                System.out.println("No such item is available in our inventory.");
            }
            System.out.println("Enter a string to search ('quit' to stop):");
            userStr = userInput.nextLine();
        }
        userInput.close(); // Closing the scanner is important because there can be memory leaks if you don't close it
    }
}
