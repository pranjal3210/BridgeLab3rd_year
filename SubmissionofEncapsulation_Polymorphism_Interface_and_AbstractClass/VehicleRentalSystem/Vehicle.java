package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.VehicleRentalSystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // Per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method for rental cost
    public abstract double calculateRentalCost(int days);

    // Getters and Setters
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
}
