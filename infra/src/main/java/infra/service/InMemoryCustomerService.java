package infra.service;

import core.model.Customer;
import core.service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCustomerService  implements CustomerService {
    private final Map<Long, Customer> store = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        store.put(customer.getId(), customer);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return store.get(id);
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(store.values());
    }
}
