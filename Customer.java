import java.util.List;
import java.util.ArrayList;
import java.util.*;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer extends Penalties
{   
        // Customer-related variables  
    private List<Media> media;  // A list that holds what media the customer currently has.
    private List<Penalties> pentalties;
    
    
    //private boolean studentRep; - Instead of student rep maybe a tier system for customers?

    public Customer()
    {
        media = new ArrayList();
    }
    
    // Getters
    //    public String getYearsOfStudy()
    //{
    //    return yearsOfStudy;
    //}

    // Setters 
    //public void setYearsOfStudy (String newYearsOfStudy)
    //{
    //    this.yearsOfStudy = newYearsOfStudy;
    //}
    
}
