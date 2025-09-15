package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.OnlineFoodDeliverySystem;

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge = 1.5; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (extraCharge * getQuantity());
    }

    @Override
    public double applyDiscount(double percentage) {
        double total = calculateTotalPrice();
        double discountAmount = total * (percentage / 100);
        return total - discountAmount;
    }

    @Override
    public String getDiscountDetails() {
        return "Special discount available for non-veg items.";
    }
}
