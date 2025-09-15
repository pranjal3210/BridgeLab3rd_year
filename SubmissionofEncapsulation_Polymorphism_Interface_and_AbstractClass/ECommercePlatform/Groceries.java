package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.ECommercePlatform;

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 5% discount on groceries
        return getPrice() * 0.05;
    }
}
