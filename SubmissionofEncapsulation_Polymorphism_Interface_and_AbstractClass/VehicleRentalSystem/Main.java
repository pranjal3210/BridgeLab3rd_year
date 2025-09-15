package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("UP32AB1234", 50.0),
                new Bike("DL10CD5678", 20.0)
        };

        int rentalDays = 5;
        System.out.println("Calculating Rental Costs for " + rentalDays + " days:");

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            System.out.println("-------------------------");
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: $" + rentalCost);

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance() * rentalDays;
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println(((Insurable) v).getInsuranceDetails());
            }

            System.out.println("Total Cost: $" + (rentalCost + insuranceCost));
        }
    }
}
