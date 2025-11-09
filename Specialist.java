/**
 * Specialist class that extends HealthProfessional
 */
public class Specialist extends HealthProfessional {
    // Medical specialty area
    private String specialtyArea;
    // Number of years of professional experience
    private int yearsOfExperience;
    
    /**
     * Default constructor that initializes specialist with default values
     */
    public Specialist() {
        super();
        this.specialtyArea = "General Medicine";
        this.yearsOfExperience = 0;
    }
    
    /**
     * Parameterized constructor to initialize specialist with specific values
     * @param id Health professional ID
     * @param name Health professional name
     * @param qualification Health professional qualification
     * @param specialtyArea Medical specialty area
     * @param yearsOfExperience Number of years of experience
     */
    public Specialist(int id, String name, String qualification, String specialtyArea, int yearsOfExperience) {
        super(id, name, qualification);
        this.specialtyArea = specialtyArea;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    /**
     * Prints detailed information about the Specialist
     */
    public void printDetails() {
        System.out.println("Health Professional Type: Specialist");
        super.printDetails();
        System.out.println("Specialty Area: " + specialtyArea);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
    
    // Getter and Setter methods
    public String getSpecialtyArea() { return specialtyArea; }
    public void setSpecialtyArea(String specialtyArea) { this.specialtyArea = specialtyArea; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }
}