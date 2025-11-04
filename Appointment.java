/**
 * Appointment class that represents a booking between a patient and a health professional
 */
public class Appointment {
    // Patient's name
    private String patientName;
    // Patient's mobile phone number
    private String mobilePhone;
    // Scheduled time slot for the appointment
    private String timeSlot;
    // Assigned doctor for the appointment
    private HealthProfessional doctor;
    
    /**
     * Default constructor that initializes appointment with default values
     */
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Not provided";
        this.timeSlot = "Not scheduled";
        this.doctor = null;
    }
    
    /**
     * Parameterized constructor to initialize appointment with specific values
     * @param patientName The patient's name
     * @param mobilePhone The patient's mobile phone number
     * @param timeSlot The scheduled time slot
     * @param doctor The assigned health professional
     */
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }
    
    /**
     * Prints all details of the appointment
     */
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Assigned Doctor:");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor assigned");
        }
        System.out.println("===========================");
    }
    
    // Getter and Setter methods
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public String getMobilePhone() { return mobilePhone; }
    public void setMobilePhone(String mobilePhone) { this.mobilePhone = mobilePhone; }
    public String getTimeSlot() { return timeSlot; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }
    public HealthProfessional getDoctor() { return doctor; }
    public void setDoctor(HealthProfessional doctor) { this.doctor = doctor; }
}