
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Media extends Penalties
{
    private String author;         
    private String mediaTitle;
    private String mediaType;
    private boolean isPhysical;
    
    private String publishDate;     
    private String publisher;       
    
    private int bookID;             
    private String theme;               // This can help categorise the media
    // private List<Themes> subThemes;  // This can help categorise the media further
    
    
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
    
    public String getMediaType()
    {
    return mediaType;
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
    
    
    // Setters for Class Variables - Media information
    
        public void setAuthor(String newAuthor)
    {
        this.author = newAuthor;
    }
    
            public void setMediaTitle(String newMediaTitle)
    {
        this.mediaTitle = newMediaTitle;
    }
    
    public void setMediaType(String newMediaType)
    {
        this.mediaType = newMediaType;
    }
    
    public void setIsPhysical(boolean newIsPhysical)
    {
        this.isPhysical = newIsPhysical;
    }

    
    // Setters for Class Variables - Publisher information
    
            public void setPublishDate(String newPublishDate)
    {
        this.publishDate = newPublishDate;
    }
    
            public void setPublisher(String newPublisher)
    {
        this.publisher = newPublisher;
    }
    
    
    // Setters for Class Variables - Book logging system Information.
    
            public void setBookID(int newBookID)
    {
        this.bookID = newBookID;
    }    
}
