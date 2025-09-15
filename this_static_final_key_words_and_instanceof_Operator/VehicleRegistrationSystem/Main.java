package this_static_final_key_words_and_instanceof_Operator.VehicleRegistrationSystem;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplayService displayService = new ConsoleDisplayService();

        // Update the registration fee
        RegistrationService.updateRegistrationFee(150.0);

        // Create new vehicle instances
        Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");

        // Display vehicle registration details
        displayService.displayRegistrationDetails(vehicle1);
        System.out.println();
        displayService.displayRegistrationDetails(vehicle2);
    }
}
