package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = "CAR_INS_" + vehicleNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        // Insurance is 5% of rental rate per day
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}
