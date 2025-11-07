/**
 * General Practitioner class that extends HealthProfessional
 */
public class GeneralPractitioner extends HealthProfessional {
    // Clinic location where the GP practices
    private String clinicLocation;
    
    /**
     * Default constructor that initializes GP with default values
     */
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Main Clinic";
    }
    
    /**
     * Parameterized constructor to initialize GP with specific values
     * @param id Health professional ID
     * @param name Health professional name
     * @param qualification Health professional qualification
     * @param clinicLocation Clinic location
     */
    public GeneralPractitioner(int id, String name, String qualification, String clinicLocation) {
        super(id, name, qualification);
        this.clinicLocation = clinicLocation;
    }
    
    /**
     * Prints detailed information about the General Practitioner
     */
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
    }
    
    // Getter and Setter methods
    public String getClinicLocation() { return clinicLocation; }
    public void setClinicLocation(String clinicLocation) { this.clinicLocation = clinicLocation; }
}