
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // Login Details
    private String userName;
    private String password;
    //private String userID;      // This is to "log" a users activity will be implemented later
    
    // Individual Details
    //private List title;         // This will be populated for the user to pull from
    private String firstName;
    private String surname;
    private String dateOfBirth;
    
    // Contact Details
    private String emailAddress;
    private int phoneNumber;
    private String homeAddress;
    
    
    
        // Getters for Class Variables - Login Details
        
    public String getUserName()
    {
        return userName;
    }
    
        public String getPassword()
    {
        return password;
    }
    
    
        // Getters for Class Variables - Individual Details
        
            public String getFirstName()
    {
        return firstName;
    }
    
            public String getSurname()
    {
        return surname;
    }
    
            public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    
            // Getters for Class Variables - Contact Details
            
            public String getEmailAddress()
    {
        return emailAddress;
    }
    
            public int getPhoneNumber()
    {
        return phoneNumber;
    }
    
            public String getHomeAddress()
    {
        return homeAddress;
    }
        
    
        // Setters for Class Variables - Login Details
    
        public void setUserName(String newUserName)
    {
        this.userName = newUserName;
    }
    
        public void setPassword(String newPassword)
    {
        this.password = newPassword;
    }

    
        // Setters for Class Variables - Personal Details
        public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
            public void setSurname(String newSurname)
    {
        this.surname = newSurname;
    }
    
            public void setDateOfBirth(String newDateOfBirth)
    {
        this.dateOfBirth = newDateOfBirth;
    }
    
    
    // Setters for Class Variables - Contact Details
            public void setEmailAddress(String newEmailAddress)
    {
        this.emailAddress = newEmailAddress;
    }
    
            public void setPhoneNumber(int newPhoneNumber)
    {
        this.phoneNumber = newPhoneNumber;
    }
    
            public void setHomeAddress(String newHomeAddress)
    {
        this.homeAddress = newHomeAddress;
    }
    
    
    // Functions 
    
    
}
