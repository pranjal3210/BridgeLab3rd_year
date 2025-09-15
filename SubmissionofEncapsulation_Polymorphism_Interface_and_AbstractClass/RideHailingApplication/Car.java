package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.RideHailingApplication;

class Car extends Vehicle implements GPS {
    private String location;

    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        // Cars have a base fare of $5
        double baseFare = 5.0;
        return baseFare + (distance * getRatePerKm());
    }

    @Override
    public String getCurrentLocation() {
        return "Current Location: " + location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
