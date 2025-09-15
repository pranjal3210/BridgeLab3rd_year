package this_static_final_key_words_and_instanceof_Operator.ShoppingCartSystem;

public class Main {
    public static void main(String[] args) {
        PricingService pricingService = new PricingService();
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        // Update the discount for all products
        DiscountService.updateDiscount(10.0); // 10% discount

        // Create new product instances
        Product product1 = new Product("P001", "Laptop", 1200.00, 5);
        Product product2 = new Product("P002", "Smartphone", 800.00, 10);

        // Display product details
        displayService.displayProductDetails(product1, pricingService);
        System.out.println();
        displayService.displayProductDetails(product2, pricingService);
    }
}
