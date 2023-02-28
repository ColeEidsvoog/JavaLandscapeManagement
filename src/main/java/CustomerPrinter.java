public class CustomerPrinter {
    public void printCustomerInfo(Customer customer) {
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone number: " + customer.getPhoneNumber());
        System.out.println("Address: " + customer.getAddress());
    }
}
