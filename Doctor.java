class Doctor extends Person {
    private String doctorID;
    private String department;
    private String specialization;

    public Doctor(String name, int age, String gender, String doctorID, String department, String specialization) {
        super(name, age, gender); 
        this.doctorID = doctorID;
        this.department = department;
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- DOCTOR DETAILS ---");
        System.out.println("ID: " + doctorID);
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("----------------------");
    }

    public void prescribeMedication(String medicine) {
        System.out.println("Dr. " + this.name + " prescribes: " + medicine);
    }
    
    public String getDepartment() {
        return department;
    }
}
