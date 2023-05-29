package io.codelex.oop.persons;

public class Customer extends Person {
    private final String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        String information = getFirstName() + " " + getLastName() + " " + getCustomerId();
        if (purchaseCount > 0) {
            information += " (" + getPurchaseCount() + " purchases)";
        }
        return information;
    }
}
