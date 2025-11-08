/**
 * Base class for all health professionals
 */
public class HealthProfessional {
    // Unique identifier for the health professional
    private int id;
    // Health professional's name
    private String name;
    // Health professional's qualification
    private String qualification;
    
    /**
     * Default constructor that initializes health professional with default values
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.qualification = "Not specified";
    }
    
    /**
     * Parameterized constructor to initialize health professional with specific values
     * @param id Health professional ID
     * @param name Health professional name
     * @param qualification Health professional qualification
     */
    public HealthProfessional(int id, String name, String qualification) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
    }
    
    /**
     * Prints basic details of the health professional
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
    }
    
    // Getter and Setter methods
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
}