
package school.course.mangment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ITECH
 */
public class Admin extends Staff{
    
    private ArrayList<Classroom>classes=new ArrayList();

    public Admin() {
    }



 

    public Admin(double salary, int yearJoined, Department department, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(salary, yearJoined, department, username, password, name, dateOfBirth, email, phone);
        InsertAdmin();
    }
    
    
    
//    public String CheckAvaiability(){
//    for(int i=0;i<=classes.size();i++){
//        if(classes.get(i).getNumOfStudents()<30){
//            Student d=new Student() {};
//         //  Classroom.stud.add(d);
//            return "Student Added";
//           
//        }
//        else{
//            return "Classroom is Full";
//        }
//    }
//        return "No classrooms yet";
//    }
//    
     public void InsertAdmin(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "INSERT INTO ADMIN VALUES('"+this.name+"',"+this.yearJoined+" "
                     + ",'"+this.username+"', '"+this.password+"','"+this.department.getdName()+" ')";
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
    }
   public void deleteAdmin(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "DELETE FROM ADMIN WHERE USERNAME="+this.username;
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
           String sql = "SELECT * FROM ADMIN";
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
    @Override
    public void signUp() {
    }

    @Override
    public void displayInfo() {
    }

    @Override
    public void verifyLogin(String username, String password) {
    }

    @Override
    public void setUsername(String username) {
        this.username=username;
    }

    @Override
    public void setPassword(String password) {
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

    public ArrayList<Classroom> getClasses() {
        return classes;
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
    public Admin verifyAdminLogin(String username, String password) {
        ArrayList<String> tempu = new ArrayList();
        ArrayList<String> tempp = new ArrayList();
        boolean f = false; 
            String url = "jdbc:derby://localhost:1527/course";

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM ADMIN";
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
