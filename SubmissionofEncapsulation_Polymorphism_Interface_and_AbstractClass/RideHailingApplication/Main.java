package SubmissionofEncapsulation_Polymorphism_Interface_and_AbstractClass.RideHailingApplication;

public class Main {
    public static void bookRide(Vehicle vehicle, double distance) {
        System.out.println("-------------------------");
        vehicle.getVehicleDetails();

        if (vehicle instanceof GPS) {
            ((GPS) vehicle).updateLocation("City Center");
            System.out.println(((GPS) vehicle).getCurrentLocation());
        }

        double fare = vehicle.calculateFare(distance);
        System.out.println("Ride Distance: " + distance + " km");
        System.out.println("Calculated Fare: $" + fare);
    }

    public static void main(String[] args) {
        Vehicle[] availableVehicles = {
                new Car(11, "Grace", 1.2),
                new Bike(22, "Heidi", 0.5),
                new Auto(33, "Ivan", 0.8)
        };

        double rideDistance = 10.0; // 10 km ride

        System.out.println("Booking rides for a " + rideDistance + " km trip:");
        for (Vehicle v : availableVehicles) {
            bookRide(v, rideDistance);
        }
    }
}
