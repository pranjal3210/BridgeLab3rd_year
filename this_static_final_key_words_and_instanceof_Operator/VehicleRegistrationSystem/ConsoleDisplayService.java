package this_static_final_key_words_and_instanceof_Operator.VehicleRegistrationSystem;

class ConsoleDisplayService {
    public void displayRegistrationDetails(Object vehicleObject) {
        if (vehicleObject instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) vehicleObject;
            System.out.println("Owner Name: " + vehicle.getOwnerName());
            System.out.println("Vehicle Type: " + vehicle.getVehicleType());
            System.out.println("Registration Number: " + vehicle.getRegistrationNumber());
            System.out.println("Registration Fee: $" + RegistrationService.getRegistrationFee());
        } else {
            System.out.println("The object is not an instance of the Vehicle class.");
        }
    }
}
