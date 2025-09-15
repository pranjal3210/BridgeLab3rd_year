package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.ECommercePlatform;

public class Main {
    public static void calculateAndPrintFinalPrice(Product product) {
        double basePrice = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = basePrice - discount + tax;

        System.out.println("-------------------------");
        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: -$" + discount);
        if (tax > 0) {
            System.out.println("Tax: +$" + tax);
        }
        System.out.println("Final Price: $" + finalPrice);
    }

    public static void main(String[] args) {
        Product[] products = {
                new Electronics(201, "Laptop", 1200),
                new Clothing(202, "T-Shirt", 25),
                new Groceries(203, "Apples", 5)
        };

        System.out.println("Calculating Final Prices for Products:");
        for (Product prod : products) {
            calculateAndPrintFinalPrice(prod);
        }
    }
}
