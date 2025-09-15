package this_static_final_key_words_and_instanceof_Operator.VehicleRegistrationSystem;

class RegistrationService {
    // Static variable shared by all vehicles
    private static double registrationFee = 100.0;

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Please enter a non-negative value.");
        }
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }
}
