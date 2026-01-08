import java.util.ArrayList;

public class HospitalSystem {
    public static void searchDoctorByName(ArrayList<Doctor> list, String nameToFind) {
        boolean found = false;
        System.out.println("\nSearching for Doctor: " + nameToFind + "...");

        for (Doctor d : list) {
            if (d.getName().equalsIgnoreCase(nameToFind)) {
                System.out.println(">> RECORD FOUND:");
                d.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println(">> No doctor found with the name: " + nameToFind);
        }
    }

    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();

        Doctor d1 = new Doctor("Hanif Hidayat", 35, "Male", "D001", "Cardiology", "Heart Surgeon");
        Doctor d2 = new Doctor("Taqaufa", 63, "Male", "D002", "Pediatrics", "Child Specialist");

        Patient p1 = new Patient("Mike Ross", 30, "Male", "P100", "Flu", true);
        Patient p2 = new Patient("Rachel Zane", 28, "Female", "P101", "Fracture", false);

        doctors.add(d1);
        doctors.add(d2);
        patients.add(p1);
        patients.add(p2);

        // Demonstrate Inheritance and Methods
        System.out.println("=== HOSPITAL DATABASE ===");
        d1.displayInfo();
        p1.displayInfo();

        // Demonstrate Interaction (Appointment)
        Appointment apt1 = new Appointment(d1, p1, "2026-10-10");
        apt1.printSlip();

        // Demonstrate specific logic
        d1.prescribeMedication("Aspirin");
        p2.payBill(500.00); // No insurance
        p1.payBill(500.00); // Has insurance

        // EXTRA FEATURE: SEARCH FUNCTION DEMO
        searchDoctorByName(doctors, "Hanif Hidayat");
        searchDoctorByName(doctors, "House MD"); // Should fail
    }
}
