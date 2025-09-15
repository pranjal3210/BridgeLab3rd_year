package this_static_final_key_words_and_instanceof_Operator.ShoppingCartSystem;

class PricingService {
    public double getDiscountedPrice(Product product) {
        double currentDiscount = DiscountService.getDiscount();
        return product.getPrice() - (product.getPrice() * currentDiscount / 100);
    }
}
