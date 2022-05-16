
package school.course.mangment.system;

import java.util.ArrayList;

public abstract class User {
    // Variables
    protected String username;
    protected String password;
    
    protected ArrayList <String> usernames = new ArrayList();
    protected ArrayList <String> passwords = new ArrayList();

    
    protected String name;
    protected String dateOfBirth;
    protected String email;
    protected String phone;
    
    
    // Constructors
    public User() {
    }

    public User(String username, String password, String name, String dateOfBirth, String email, String phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.usernames.add(username); 
        this.passwords.add(password); 
    }
    
    // Abstract methods
    abstract public void signUp();
    
    abstract public void displayInfo();
    
    abstract public void verifyLogin(String username, String password);
    
    
    // Setters

    abstract public void setUsername(String username);

    abstract public void setPassword(String password);

    abstract public void setName(String name);

    abstract public void setDateOfBirth(String dateOfBirth);

    abstract public void setEmail(String email);

    abstract public void setPhone(String phone);
    
    // Getters

    abstract public String getUsername();

    abstract public String getPassword();

    abstract public String getName();

    abstract public String getDateOfBirth();

    abstract public String getEmail();

    abstract public String getPhone();
    
    
    
}
