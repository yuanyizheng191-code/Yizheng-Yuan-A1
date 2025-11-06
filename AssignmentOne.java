import java.util.ArrayList;
import java.util.Iterator;

/**
 * Main class containing the program entry point and appointment management functionality
 */
public class AssignmentOne {
    
    // Collection to store all appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    
    /**
     * Main method - entry point of the program
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        
        // Create three General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Sarah Wilson", "MBBS", "City Central Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Michael Brown", "MD", "Northside Medical Center");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Emily Chen", "MBBS", "West End Clinic");
        
        // Create two Specialist objects
        Specialist sp1 = new Specialist(201, "Dr. James Lee", "MD, Cardiology", "Cardiology", 10);
        Specialist sp2 = new Specialist(202, "Dr. Lisa Wang", "MD, Pediatrics", "Pediatrics", 8);
        
        // Use the methods to print the details of all health professionals
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        sp1.printDetails();
        System.out.println("------------------------------");
        sp2.printDetails();
        System.out.println("------------------------------");
        
        System.out.println("------------------------------");
        
        // Part 5 – Collection of appointments
        
        // Create appointments with general practitioners
        createAppointment("John Smith", "0412345678", "10:00", gp1);
        createAppointment("Mary Johnson", "0498765432", "14:30", gp2);
        
        // Create appointments with specialists
        createAppointment("David Lee", "0432156789", "11:15", sp1);
        createAppointment("Sarah Brown", "0444555666", "15:45", sp2);
        
        // Print existing appointments
        printExistingAppointments();
        
        // Cancel one of the existing appointments
        cancelBooking("0498765432");
        
        // Print again existing appointments to demonstrate the updated collection
        printExistingAppointments();
        
        System.out.println("------------------------------");
    }
    
    /**
     * Creates a new appointment with the provided details
     * @param patientName The patient's name
     * @param mobilePhone The patient's mobile phone number
     * @param timeSlot The scheduled time slot
     * @param doctor The assigned health professional
     */
    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        // Validate patient name
        if (patientName == null || patientName.trim().isEmpty()) {
            System.out.println("Error: Patient name must be provided.");
            return;
        }
        
        // Validate mobile phone
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("Error: Mobile phone must be provided.");
            return;
        }
        
        // Validate time slot
        if (timeSlot == null || timeSlot.trim().isEmpty()) {
            System.out.println("Error: Time slot must be provided.");
            return;
        }
        
        // Validate doctor
        if (doctor == null) {
            System.out.println("Error: Doctor must be selected.");
            return;
        }
        
        // Create new appointment and add to collection
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName);
    }
    
    /**
     * Prints all existing appointments
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        
        System.out.println("Current Appointments (" + appointments.size() + "):");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println("Appointment #" + (i + 1) + ":");
            appointments.get(i).printAppointmentDetails();
        }
    }
    
    /**
     * Cancels an appointment based on mobile phone number
     * @param mobilePhone The patient's mobile phone number
     */
    public static void cancelBooking(String mobilePhone) {
        // Validate mobile phone
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("Error: Mobile phone number is required to cancel booking.");
            return;
        }
        
        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;
        
        // Iterate through appointments to find and cancel the matching one
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (mobilePhone.equals(appointment.getMobilePhone())) {
                iterator.remove();
                System.out.println("Appointment for mobile " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Error: No appointment found for mobile " + mobilePhone);
        }
    }
}