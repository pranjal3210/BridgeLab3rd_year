package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.ECommercePlatform;

class Clothing extends Product implements Taxable {
    private static final double VAT_RATE = 0.05; // 5% VAT

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // 20% discount on clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * VAT_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "VAT @5%";
    }
}
