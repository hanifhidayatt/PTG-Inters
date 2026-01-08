class Patient extends Person { 
    private String patientID;
    private String illness;
    private boolean insurance;

    public Patient(String name, int age, String gender, String patientID, String illness, boolean insurance) {
        super(name, age, gender);
        this.patientID = patientID;
        this.illness = illness;
        this.insurance = insurance;
    }
  
    @override
    public void displayInfo() {
        System.out.println("--- PATIENT DETAILS ---");
        System.out.println("ID: " + patientID);
        super.displayInfo();
        System.out.println("Diagnosed with: " + illness);
        System.out.println("Has Insurance: " + (insurance ? "Yes" : "No"));
        System.out.println("-----------------------");
    }

    public void payBill(double amount) {
        if (insurance) {
            System.out.println("Patient " + this.name + " pays discounted bill: $" + (amount * 0.5));
        } else {
            System.out.println("Patient " + this.name + " pays full bill: $" + amount);
        }
    }
}
