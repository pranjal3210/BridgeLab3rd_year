package this_static_final_key_words_and_instanceof_Operator.ShoppingCartSystem;

class DiscountService {
    private static double discount = 0.0;

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0.0 && newDiscount <= 100.0) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
        }
    }

    public static double getDiscount() {
        return discount;
    }
}

