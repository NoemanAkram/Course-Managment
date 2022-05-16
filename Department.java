
package school.course.mangment.system;

import java.util.ArrayList;

public class Department {
    
    // Variables
    private int dNumber;
    private String dName;
    public ArrayList<Staff> staff = new ArrayList();
    
    // Constructors

    public Department(int dNumber, String dName) {
        this.dNumber = dNumber;
        this.dName = dName;
    }

    public Department() {
    }
    
    
    // Getters

    public int getdNumber() {
        return dNumber;
    }

    public String getdName() {
        return dName;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }
    
    
    // Setters

    public void setdNumber(int dNumber) {
        this.dNumber = dNumber;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }
    
}
