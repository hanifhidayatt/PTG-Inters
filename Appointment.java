public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void printSlip() {
        System.out.println("\n=== APPOINTMENT SLIP ===");
        System.out.println("Date: " + date);
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getDepartment() + ")");
        System.out.println("Patient: " + patient.getName());
        System.out.println("========================");
    }

    public void cancel() {
        System.out.println("Appointment for " + patient.getName() + " has been cancelled.");
    }
}
