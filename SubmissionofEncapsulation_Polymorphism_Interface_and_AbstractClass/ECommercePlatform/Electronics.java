package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.ECommercePlatform;

class Electronics extends Product implements Taxable {
    private static final double GST_RATE = 0.18; // 18% GST

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * GST_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "GST @18%";
    }
}
