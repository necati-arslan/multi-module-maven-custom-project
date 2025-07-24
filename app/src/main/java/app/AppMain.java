package app;

import core.CoreService;
import core.model.Customer;
import core.service.CustomerService;
import infra.service.InMemoryCustomerService;

public class AppMain {
    public static void main(String[] args) {
        CustomerService service = new InMemoryCustomerService();

        service.addCustomer(new Customer(1L, "Alice"));
        service.addCustomer(new Customer(2L, "Bob"));

        System.out.println("All customers:");
        service.findAll().forEach(System.out::println);
    }
}
