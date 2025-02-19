package demo.boot.model;

public sealed class Customer permits RegularCustomer, PremiumCustomer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
