package app;

import core.CoreService;
import infra.InfraAdapter;

public class AppMain {
    public static void main(String[] args) {
        CoreService service = new CoreService();
        InfraAdapter adapter = new InfraAdapter();
        System.out.println(service.message());
        System.out.println(adapter.connect());
    }
}
