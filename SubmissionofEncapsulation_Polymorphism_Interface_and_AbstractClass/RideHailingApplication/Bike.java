package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.RideHailingApplication;

class Bike extends Vehicle {
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
