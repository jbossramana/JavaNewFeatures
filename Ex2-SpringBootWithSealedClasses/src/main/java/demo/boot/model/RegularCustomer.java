package demo.boot.model;

public final class RegularCustomer extends Customer {
    public RegularCustomer(String name) {
        super(name);
    }

    public String getType() {
        return "Regular";
    }
}
