
package school.course.mangment.system;

public abstract class Staff extends User {
    
    // Variables
    protected double salary;
    protected int yearJoined;
    protected Department department;
    
    // Constructors

    public Staff() {
    }

    public Staff(double salary, int yearJoined, Department department) {
        this.salary = salary;
        this.yearJoined = yearJoined;
        this.department = department;
    }

    public Staff(double salary, int yearJoined, Department department, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(username, password, name, dateOfBirth, email, phone);
        this.salary = salary;
        this.yearJoined = yearJoined;
        this.department = department;
    }

    public Staff(String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(username, password, name, dateOfBirth, email, phone);
    }
    // Abstract methods
    abstract public double getSalary();

    abstract public void setSalary(double salary);

    abstract public int getYearJoined();

    abstract public void setYearJoined(int yearJoined);

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
    
    
    
    
    

   
    // Overriden methods
    @Override
    abstract public void signUp();

    @Override
    abstract public void displayInfo();

    @Override
    abstract public void verifyLogin(String username, String password);

    @Override
    abstract public void setUsername(String username);

    @Override
    abstract public void setPassword(String password);

    @Override
    abstract public void setName(String name);

    @Override
    abstract public void setDateOfBirth(String dateOfBirth);

    @Override
    abstract public void setEmail(String email);

    @Override
    abstract public void setPhone(String phone);

    @Override
    abstract public String getUsername();

    @Override
    abstract public String getPassword();

    @Override
    abstract public String getName();

    @Override
    abstract public String getDateOfBirth();

    @Override
    abstract public String getEmail();

    @Override
    abstract public String getPhone();
    
}
