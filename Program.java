package school.course.mangment.system;

public class Program {
//variables
    private String name;
    private int failPerc;
    private int modulesNumberPerYear;
    private int numberOfStudents;
    private double gpaReq; 

//Constructor
    
    public Program() {
    }

    public Program(String name, int failPerc, int modulesNumberPerYear, double gpaReq) {
        this.name = name;
        this.failPerc = failPerc;
        this.modulesNumberPerYear = modulesNumberPerYear;
      
        this.gpaReq = gpaReq;
    }
    
    
    double check_min_gpa(String name ){
        double gpa;
       if(name=="American"){
           gpa = 2.5;
       }
           else {
           gpa = 3;
       } 
        return gpa; 
        
    }
//Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFailPerc() {
        return failPerc;
    }

    public void setFailPerc(int failPerc) {
        this.failPerc = failPerc;
    }

    public int getModulesNumberPerYear() {
        return modulesNumberPerYear;
    }

    public void setModulesNumberPerYear(int modulesNumberPerYear) {
        this.modulesNumberPerYear = modulesNumberPerYear;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent() {
        this.numberOfStudents ++;
    }
      public void removeStudent() {
        this.numberOfStudents--;
    }
    public double getGpaReq() {
        return gpaReq;
    }

    public void setGpaReq(double gpaReq) {
        this.gpaReq = gpaReq;
    }
    

}
