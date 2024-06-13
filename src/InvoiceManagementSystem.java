import java.util.ArrayList;
import java.util.List;

public class InvoiceManagementSystem {
    private List<Customer> customers;
    private List<Invoice> invoices;

    public InvoiceManagementSystem() {
        customers = new ArrayList<>();
        invoices = new ArrayList<>();
    }

    public void addCustomer(int id, String name, String address) {
        customers.add(new Customer(id, name, address));
    }

    public void addInvoice(int invoiceId, int customerId) {
        invoices.add(new Invoice(invoiceId, customerId));
    }

    public void addItemToInvoice(int invoiceId, String description, int quantity, double price) {
        for (Invoice invoice : invoices) {
            if (invoice.getId() == invoiceId) {
                invoice.addItem(new Item(description, quantity, price));
                return;
            }
        }
        System.out.println("Invoice not found!");
    }

    public void listAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void listAllInvoices() {
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    public void listInvoicesOfCustomer(int customerId) {
        for (Invoice invoice : invoices) {
            if (invoice.getCustomerId() == customerId) {
                System.out.println(invoice);
            }
        }
    }

    public void displayInvoiceDetails(int invoiceId) {
        for (Invoice invoice : invoices) {
            if (invoice.getId() == invoiceId) {
                System.out.println(invoice);
                return;
            }
        }
        System.out.println("Invoice not found!");
    }
}
