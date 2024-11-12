
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
    private String Author;          // 
    private String BookTitle;       // 
    private String PublishDate;     //
    private String Publisher;       //
    private int BookID;             //
    private String Theme;           //
    
    
    // Placeholder variables for booking system.
    private String Issuer;          // This will pull from the Staff component the user Class.  
    private String DateOfBooking;   //
    private String ReturnDate;      //
    
    public String getAuthor()
    {
        return Author;
    }
    
    public void setAuthor(String newAuthor)
    {
        this.Author = newAuthor;
    }
    
}
