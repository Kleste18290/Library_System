import java.util.List;
import java.util.*;

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    private String  name;
    private int     studentAllotment;
    private int     maxStudent;
    
    private int     credits;
    private int     totalCredits;
    
    private List<Module>    modules;
    private List<Staff>     staff;
    private List<Customer>  students;


    /**
     * Constructor for objects of class Course
     */
    public Course()
    {
    String  name = "";
    int     studentAllotment = 0;
    int     maxStudent = 0;
    int     credits = 0;
    int     totalCredits = 0;
    modules = new ArrayList();
    staff = new ArrayList();
    //Staff newStaff = staff.get(0);    - This creates a new object
    //newStaff.getUserName();           - This gets the username from the object inherited class.
    //staff.get(0).getUserName(); // 
    students = new ArrayList();
    }
    
}
