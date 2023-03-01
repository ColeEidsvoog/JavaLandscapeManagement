import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main{
    public static void main(String[] args) {

        boolean running = true; // flag to control the loop

        Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>(); // map to store customers

        CustomerPrinter newPrint = new CustomerPrinter(); // instance of a class to print customer information

        int customerCount = 0; // variable to keep track of the number of customers

        while(running) { // main loop for the program

            // Display the menu to the user
            System.out.println("------------------------------------------------------------------------------------------------------------------------------ ");
            Scanner userIn = new Scanner(System.in);
            System.out.println("To add a new customer enter: new \nTo search for an existing customer enter: search \nTo quit the program enter: quit \nTo view employee system enter: employee");
            String initialChoice = userIn.nextLine();

            // If the user chooses to add a new customer
            if(initialChoice.contains("new")){
                customerCount++;

                // Prompt the user for information about the new customer
                System.out.print("Enter customer name: ");
                String customerName = userIn.nextLine();

                System.out.print("Enter customer phone number: ");
                String phoneNumber = userIn.nextLine();

                System.out.print("Enter customer address: ");
                String address = userIn.nextLine();

                System.out.print("Enter customer notes: ");
                String notes = userIn.nextLine();

                int customerId = customerCount;

                // Create a new instance of the Customer class with the provided information
                Customer customer = new Customer(customerId, customerName, phoneNumber, address, notes);

                // Add the new customer to the map
                customerMap.put(customerId, customer);

                // Print the customer information to the console
                System.out.println("A new customer has been created with these attributes: ");
                newPrint.printCustomerInfo(customer);
                System.out.println("\n");

                // If the user chooses to search for an existing customer
            } else if (initialChoice.contains("search")) {

                // Prompt the user for the customer ID to search for
                System.out.println("Please enter the customer ID");
                int idSearch = userIn.nextInt();

                userIn.nextLine(); // Test to consume the newline character in the input buffer

                // Attempt to retrieve the customer from the map using the provided ID
                Customer customer = customerMap.get(idSearch);

                // If the customer is found, print their information to the console
                if (customer != null) {
                    newPrint.printCustomerInfo(customer);

                    // Prompt the user to see if they want to make any changes to the customer's information
                    System.out.println("\n");
                    System.out.println("Would you like to change any information about this customer?");
                    String alterData = userIn.nextLine();

                    if(alterData.contains("yes")){
                        System.out.println("Still need to add this functionality"); // Needs work
                    } else if (alterData.contains("no")) {
                        System.out.println("no changes made.");
                    } else{
                        System.out.println("your answer must be yes or no");
                    }

                } else {
                    // If the customer is not found, inform the user
                    System.out.println("Customer with ID " + idSearch + " not found.");
                }

                // If the user chooses to quit the program
            } else if(initialChoice.contains("quit")){

                running = false;

                // If the user chooses to view the employee system (not yet implemented)
            } else if(initialChoice.contains("employee")){

                System.out.println("Still need to finish");

                // If the user provides an unrecognized input
            } else{
                System.out.println("that does not match any known commands please try again");
            }
        }
    }
}
