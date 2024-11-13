
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Media extends Library
{
    private String author;         
    private String mediaTitle;       
    private boolean isPhysical;
    
    private String publishDate;     
    private String publisher;       
    
    private int bookID;             
    private String theme;           
    
    
    // Placeholder variables for booking system.
    //private String issuer;          // This will pull from the Staff component the user Class.  
    //private String dateOfBooking;   //
    //private String returnDate;      //
    // private String 
    
    // Getters for Class Variables - Media information
    
    public String getAuthor()
    {
        return author;
    }

        public String getMediaTitle()
    {
        return mediaTitle;
    }
    
    public boolean getIsPhysical()
    {
        return isPhysical;
    }
    
    
    // Getters for Class Variables - Publisher information
    
        public String getPublishDate()
    {
        return publishDate;
    }
    
        public String getPublisher()
    {
        return publisher;
    }
    
        public int BookID()
    {
        return bookID;
    }
    
    
    // Setters for Class Variables.
    
        public void setAuthor(String newAuthor)
    {
        this.author = newAuthor;
    }
    
            public void setMediaTitle(String newMediaTitle)
    {
        this.mediaTitle = newMediaTitle;
    }
    
    public void setIsPhysical(boolean newIsPhysical)
    {
        this.isPhysical = newIsPhysical;
    }
    
            public void setPublishDate(String newPublishDate)
    {
        this.publishDate = newPublishDate;
    }
    
            public void setPublisher(String newPublisher)
    {
        this.publisher = newPublisher;
    }
    
            public void setBookID(int newBookID)
    {
        this.bookID = newBookID;
    }
    
}
