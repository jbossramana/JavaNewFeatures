package demo.boot.model;

public final class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    public String getType() {
        return "Premium";
    }
}