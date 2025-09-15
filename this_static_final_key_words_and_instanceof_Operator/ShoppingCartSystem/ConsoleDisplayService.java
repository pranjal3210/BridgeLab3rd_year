package this_static_final_key_words_and_instanceof_Operator.ShoppingCartSystem;

class ConsoleDisplayService {
    public void displayProductDetails(Object productObject, PricingService pricingService) {
        if (productObject instanceof Product) {
            Product product = (Product) productObject;
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Discount: " + DiscountService.getDiscount() + "%");
            System.out.println("Price after Discount: $" + pricingService.getDiscountedPrice(product));
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
}
