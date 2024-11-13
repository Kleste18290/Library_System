import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends User
{   
        // Student-related variables     
    private List<Module> modules;    
    private String yearsOfStudy;
    
    private int credits;
    private int requiredCredits;
    
    private boolean studentRep; 

    // Getters
        public String getYearsOfStudy()
    {
        return yearsOfStudy;
    }

    // Setters 
    public void setYearsOfStudy (String newYearsOfStudy)
    {
        this.yearsOfStudy = newYearsOfStudy;
    }
    
}
