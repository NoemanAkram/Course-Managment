/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.course.mangment.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import school.course.mangment.system.AGui;
import school.course.mangment.system.Admin;
import school.course.mangment.system.Department;
import school.course.mangment.system.IT;
import school.course.mangment.system.Staff;
import school.course.mangment.system.Student;
import school.course.mangment.system.Teacher;
/**
 *
 * @author ITECH
 */
public class Accountant extends Staff implements AGui{
    
    private String workingHours;
    private ArrayList<Student>students=new ArrayList();


        // Constructors
    public Accountant(String workingHours) {
        this.workingHours = workingHours;
    }
    
    public Accountant(){
        
    }

    public Accountant(double salary, int yearJoined, Department department) {
        super(salary, yearJoined, department);
    }

    public Accountant(double salary, int yearJoined, Department department, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(salary, yearJoined, department, username, password, name, dateOfBirth, email, phone);
        InsertAcc(); 
        }
    
    public void InsertAcc(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "INSERT INTO ACCOUNTANT VALUES('"+this.name+"',"+this.yearJoined+" ,'"+this.username+"', '"+this.password+"','"+this.department.getdName()+" ')";
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
    }
      
     public void retrieveAdmin(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM ACCOUNTANT";
Statement st = con.createStatement();
ResultSet rs=null;
rs=st.executeQuery(sql);
while(rs.next()){
System.out.println(rs.getString("name")+"\t"+rs.getInt("year_joined")+"\t"+rs.getString("username")+"\t"+rs.getString("password")+"\t"+rs.getString("department"));
}
rs.close();
st.close();
con.close();
} catch (SQLException ex) {
System.out.println(ex);}
        
    }
      public void deleteAccountant(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "DELETE FROM ACCOUNTANT WHERE USERNAME="+this.username;
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
          }
    // Setters and Getters
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }
    
    // Methods
    void SignUp(){}
    
    
    public void CalculateFees(Student s){
        double fees = 10000+(s.getYear()*1000);
        s.setFees(fees);
    }
    
   public void ACalculateSalary(Admin a){
      double sa = (2022 - a.getYearJoined())*1000;
       a.setSalary(sa);
   
   }
   public void TCalculateSalary(Teacher t){
   double sa = (2022 - t.getYearJoined())*2000;
       t.setSalary(sa);
   }
   public void ITCalculateSalary(IT i){
   double sa = (2022 - i.getYearJoined())*500;
       i.setSalary(sa);
   }
   
   
   public boolean VerifyLogin(String name, String pass){
       String n="";
       String p="";
   
        if(name==n && pass==p){
            return true;
        }
        else{return false;}
   
   }

   // Overriden methods
    @Override
    public double getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setSalary(double salary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getYearJoined() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setYearJoined(int yearJoined) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verifyLogin(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPhone(String phone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUsername() {
       return username; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        return name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDateOfBirth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Department getDepartment() {
        return department;
    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }
     
    public Accountant verifyACCOUNTANTLogin(String username, String password) {
        ArrayList<String> tempu = new ArrayList();
        ArrayList<String> tempp = new ArrayList();
        boolean f = false; 
            String url = "jdbc:derby://localhost:1527/course";

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM ACCOUNTANT";
Statement st = con.createStatement();
ResultSet rs=null;
rs=st.executeQuery(sql);
while(rs.next()){
  
    tempu.add(rs.getString(3));
    tempp.add(rs.getString(4));
}
rs.close();
st.close();
con.close();
} catch (SQLException ex) {
System.out.println(ex);}
        for(int i=0; i<tempp.size();i++){
            if(tempu.get(i).contains(username) && tempp.get(i).contains(password)){
                System.out.println("Login Succefful");
                f = true;
                break;
            }else{                
                System.out.println("try again");
                f = false;
                
            }
        }
        if(f == true){
            return this; 
        }else{
            return null; 
        }
           
}
    
    
}