
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
    private boolean inStock;
    private int quantity;
    
    // Book properties
    private boolean isPhysical;
    private String condition;
    
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
    
        public Media(String Author, String mediaTitle, String mediaType, boolean isPhysical, String publishDate, String publisher) // Initialisation of the classes with placeholder variables.
    {
        author = "Unknown.";
        mediaTitle = "Unknown.";
        mediaType = "Unknown.";
        inStock = false;
        quantity = 0;
    }
    
    
    
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
    
        public boolean getInStock()
    {
        return inStock;
    }
    
        public int getQuantity()
    {
        return quantity;
    }
    

    // Getters for Class Variables - Book Properties
    
    public boolean getIsPhysical()
    {
        return isPhysical;
    }
    
        public String getCondition()
    {
        return condition;
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
    
        public void setInStock(boolean newInStock)
    {
        this.inStock = newInStock;
    }
    
            public void setQuantity(int newQuantity)
    {
        this.quantity = newQuantity;
    }
    
    
    // Setters for Class Variables - Media Condition
    
    public void setIsPhysical(boolean newIsPhysical)
    {
        this.isPhysical = newIsPhysical;
    }

        public void setCondition(String newCondition)
    {
        this.condition = newCondition;
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
