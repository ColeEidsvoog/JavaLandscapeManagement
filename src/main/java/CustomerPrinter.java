public class CustomerPrinter {

    // Method for printing customer information to the screen
    public void printCustomerInfo(Customer customer) {
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone number: " + customer.getPhoneNumber());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Notes: " + customer.getNotes());
    }
}
