package core.service;

import core.model.Customer;
import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    Customer findCustomerById(Long id);
    List<Customer> findAll();
}
