import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        boolean running = true;

        while(running) {
            Scanner userIn = new Scanner(System.in);

            System.out.println("Would you like to add a new customer or search for an existing customer?");

            System.out.print("Enter customer name: ");
            String customerName = userIn.nextLine();

            System.out.print("Enter customer phone number: ");
            String phoneNum = userIn.nextLine();

            System.out.print("Enter customer address: ");
            String address = userIn.nextLine();

            int max = 1000;
            Random random = new Random();
            int customerId = random.nextInt(max);

            Customer customer1 = new Customer(customerId, customerName, phoneNum, address);

            System.out.println("\n");

            System.out.println("If you like to print this customers information to the screen please enter yes");

            String doPrint = userIn.nextLine();

            if (doPrint.contains("yes")) {

                CustomerPrinter printer = new CustomerPrinter();

                printer.printCustomerInfo(customer1);

                System.out.println("If this information is correct please enter: yes , if not please enter: no");

                String correctInfo = userIn.nextLine();

                if(correctInfo.contains("yes")) {
                    System.out.println("Okay, I will add this customer to the list");
                }
                if(correctInfo.contains("no")) {
                    System.out.println("I will not add this customer to the list");
                }
            } else {
                System.out.println("Okay I wont print anything");
            }
        }
    }
}