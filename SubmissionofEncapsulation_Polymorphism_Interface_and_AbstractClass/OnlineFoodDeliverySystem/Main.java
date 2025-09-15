package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.OnlineFoodDeliverySystem;

public class Main {
    public static void processOrder(FoodItem[] order) {
        double grandTotal = 0;
        System.out.println("========= ORDER DETAILS =========");
        for (FoodItem item : order) {
            System.out.println("-------------------------");
            item.getItemDetails();
            double itemTotal = item.calculateTotalPrice();

            if(item instanceof Discountable) {
                System.out.println("Item Total (before discount): $" + itemTotal);
                System.out.println(((Discountable) item).getDiscountDetails());
                itemTotal = ((Discountable) item).applyDiscount(10); // Applying 10% discount
                System.out.println("Item Total (after 10% discount): $" + itemTotal);
            } else {
                System.out.println("Item Total: $" + itemTotal);
            }

            grandTotal += itemTotal;
        }
        System.out.println("=============================");
        System.out.println("GRAND TOTAL: $" + grandTotal);
    }

    public static void main(String[] args) {
        FoodItem[] myOrder = {
                new VegItem("Paneer Butter Masala", 12.0, 2),
                new NonVegItem("Chicken Biryani", 15.0, 1),
                new VegItem("Garlic Naan", 3.0, 4)
        };
        processOrder(myOrder);
    }
}
