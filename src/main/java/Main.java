import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main{
    public static void main(String[] args) {

        boolean running = true;

        Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();

        CustomerPrinter newPrint = new CustomerPrinter();

        int customerCount = 0;

        while(running) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------ ");
            Scanner userIn = new Scanner(System.in);

            System.out.println("To add a new customer enter: new \nTo search for an existing customer enter: search \nTo quit the program enter: quit \nTo view employee system enter: employee");
            String initialChoice = userIn.nextLine();

            if(initialChoice.contains("new")){
                customerCount++;

                System.out.print("Enter customer name: ");
                String customerName = userIn.nextLine();

                System.out.print("Enter customer phone number: ");
                String phoneNumber = userIn.nextLine();

                System.out.print("Enter customer address: ");
                String address = userIn.nextLine();

                System.out.print("Enter customer notes: ");
                String notes = userIn.nextLine();



                int customerId = customerCount;

                Customer customer = new Customer(customerId, customerName, phoneNumber, address, notes);

                customerMap.put(customerId, customer);

                System.out.println("A new customer has been created with these attributes: ");

                newPrint.printCustomerInfo(customer);

                System.out.println("\n");

            } else if (initialChoice.contains("search")) {

                System.out.println("Please enter the customer ID");
                int idSearch = userIn.nextInt();

                Customer customer = customerMap.get(idSearch);

                if (customer != null) {

                    newPrint.printCustomerInfo(customer);

                    System.out.println("\n");
                    System.out.println("Would you like to change any information about this customer?");
                    String alterData = userIn.nextLine();

                    if(alterData.contains("yes")){

                    } else if (alterData.contains("no")) {
                        System.out.println("no changes made.");
                    } else{
                        System.out.println("your answer must be yes or no");
                    }

                } else {

                    System.out.println("Customer with ID " + idSearch + " not found.");

                }

            } else if(initialChoice.contains("quit")){

                running = false;

            } else if(initialChoice.contains("employee")){

                System.out.println("Still need to finish");

            } else{
                System.out.println("that does not match any known commands please try again");
            }
        }
    }
}