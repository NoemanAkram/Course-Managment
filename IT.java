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
import school.course.mangment.system.Department;
import school.course.mangment.system.Staff;

/**
 *
 * @author ITECH
 */
public class IT  extends Staff{
    
    private String workingHours;

    public IT(String workingHours) {
        this.workingHours = workingHours;
    }

    public IT() {
    }

    public IT(double salary, int yearJoined, Department department) {
        super(salary, yearJoined, department);
    }

    public IT(double salary, int yearJoined, Department department, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(salary, yearJoined, department, username, password, name, dateOfBirth, email, phone);
        InsertIT(); 
    }
    
    

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
     public void InsertIT(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "INSERT INTO IT VALUES('"+this.name+"',"+this.yearJoined+" ,'"+this.username+"', '"+this.password+"','"+this.department.getdName()+" ')";
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
    }
     public void retrieveIT(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM IT";
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
      public void deleteIT(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "DELETE FROM IT WHERE USERNAME="+this.username;
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
          }
    void SignUp(){}
    
    void DisplayInfo(){
    
    }
    
    void ResolveIssue(){}
    
    void ReplyFeedback(){}
    
//    bool VerifyLogin(){
//        return null;
//    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary=salary;
    }

    @Override
    public int getYearJoined() {
        return yearJoined;
    }

    @Override
    public void setYearJoined(int yearJoined) {
        this.yearJoined=yearJoined;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Department getDepartment() {
        return department;
    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }
    public IT verifyITLogin(String username, String password) {
        ArrayList<String> tempu = new ArrayList();
        ArrayList<String> tempp = new ArrayList();
        boolean f = false; 
            String url = "jdbc:derby://localhost:1527/course";

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM IT";
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
