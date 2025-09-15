package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.RideHailingApplication;

class Auto extends Vehicle {
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Autos have a base fare of $2
        double baseFare = 2.0;
        return baseFare + (distance * getRatePerKm());
    }
}
