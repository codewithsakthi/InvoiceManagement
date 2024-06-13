import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvoiceManagementSystem ims = new InvoiceManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 8) {
            System.out.println("\nInvoice Management System:");
            System.out.println("1. Add a customer");
            System.out.println("2. Add an invoice");
            System.out.println("3. Add items to an invoice");
            System.out.println("4. List all customers");
            System.out.println("5. List all invoices");
            System.out.println("6. List all invoices of a customer");
            System.out.println("7. Display the full details of an invoice");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer address: ");
                    String customerAddress = scanner.nextLine();
                    ims.addCustomer(customerId, customerName, customerAddress);
                    break;
                case 2:
                    System.out.print("Enter invoice ID: ");
                    int invoiceId = scanner.nextInt();
                    System.out.print("Enter customer ID for the invoice: ");
                    int invCustomerId = scanner.nextInt();
                    ims.addInvoice(invoiceId, invCustomerId);
                    break;
                case 3:
                    System.out.print("Enter invoice ID: ");
                    int invId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter item description: ");
                    String itemDescription = scanner.nextLine();
                    System.out.print("Enter item quantity: ");
                    int itemQuantity = scanner.nextInt();
                    System.out.print("Enter item price: ");
                    double itemPrice = scanner.nextDouble();
                    ims.addItemToInvoice(invId, itemDescription, itemQuantity, itemPrice);
                    break;
                case 4:
                    System.out.println("All Customers:");
                    ims.listAllCustomers();
                    break;
                case 5:
                    System.out.println("All Invoices:");
                    ims.listAllInvoices();
                    break;
                case 6:
                    System.out.print("Enter customer ID: ");
                    int custId = scanner.nextInt();
                    System.out.println("Invoices of Customer ID " + custId + ":");
                    ims.listInvoicesOfCustomer(custId);
                    break;
                case 7:
                    System.out.print("Enter invoice ID: ");
                    int invDetailId = scanner.nextInt();
                    System.out.println("Details of Invoice ID " + invDetailId + ":");
                    ims.displayInvoiceDetails(invDetailId);
                    break;
                case 8:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
