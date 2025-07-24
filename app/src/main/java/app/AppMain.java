package app;

import core.CoreService;
import core.model.Customer;
import core.service.CustomerService;
import infra.service.InMemoryCustomerService;

import java.text.DateFormat;
import java.util.Date;

public class AppMain {
    public static void main(String[] args) {
        CustomerService service = new InMemoryCustomerService();

        service.addCustomer(new Customer(1L, "Alice"));
        service.addCustomer(new Customer(2L, "Bob"));

        System.out.println("All customers:");
        service.findAll().forEach(System.out::println);

        String name = "çağrı";
        System.out.println(name.toUpperCase()); // ❌ SpotBugs: DM_CONVERT_CASE

        // 🔸 2. Hard-coded encoding
        byte[] data = "İstanbul".getBytes(); // ❌ SpotBugs: DM_DEFAULT_ENCODING

        // 🔸 3. Date format without locale
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); // ❌ SpotBugs: DATE_FORMAT_WITHOUT_LOCALE
        System.out.println(df.format(new Date()));
    }
}
