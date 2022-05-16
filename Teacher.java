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
import school.course.mangment.system.Student;
import school.course.mangment.system.Module;
import java.util.ArrayList;
import school.course.mangment.system.Department;
import school.course.mangment.system.Staff;

/**
 *
 * @author ITECH
 */
public class Teacher extends Staff{
    private String degree;
    private int numofsession;
    private int studentattends;
    private int teacherCode;
    private Module module;
    public static ArrayList <Teacher> Teachers = new ArrayList();

    public Teacher(String degree, int numofsession, int studentattends, int teacherCode, Module module) {
        
        this.degree = degree;
        this.numofsession = numofsession;
        this.studentattends = studentattends;
        this.teacherCode = teacherCode;
        this.module = module;
    }

    public Teacher(String degree, int numofsession, int studentattends, int teacherCode, Module module, double salary, int yearJoined, Department department) {
        super(salary, yearJoined, department);
        this.degree = degree;
        this.numofsession = numofsession;
        this.studentattends = studentattends;
        this.teacherCode = teacherCode;
        this.module = module;
    }

    public Teacher(String degree, int numofsession, int studentattends, int teacherCode, Module module, double salary, int yearJoined, Department department, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(salary, yearJoined, department, username, password, name, dateOfBirth, email, phone);
        
        this.degree = degree;
        this.numofsession = numofsession;
        this.studentattends = studentattends;
        this.teacherCode = teacherCode;
        this.module = module;
    InsertTeacher(); 
    }

    public Teacher(String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(username, password, name, dateOfBirth, email, phone);
        
    }

   

   
     public void InsertTeacher(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "INSERT INTO TEACHER VALUES('"+this.name+"',"+this.yearJoined+" ,'"+this.username+"', '"+this.password+"','"+this.department.getdName()+" ')";
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
    }
     public void retrieveTeacher(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM TEACHER";
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
      public void deleteTeacher(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "DELETE FROM TEACHER WHERE USERNAME="+this.username;
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
          }
    public Teacher(){
        
    
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setStudentattends(int studentattends) {
        this.studentattends = studentattends;
    }

    public void setTeacherCode(int teacherCode) {
        this.teacherCode = teacherCode;
    }
    

    public void setNumofsession(int numofsession) {
        this.numofsession = numofsession;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    

    public String getDegree() {
        return degree;
    }

    public int getStudentattends() {
        return studentattends;
    }

    public int getTeacherCode() {
        return teacherCode;
    }
    
    

    public int getNumofsession() {
        return numofsession;
    }

    public Module getModule() {
        return module;
    }

    //user setters & getters
    
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    
    //methods
    
    String ma;
    public String ManageAttendents(int studentattends){
     
        if(studentattends >7){
            ma="Student has a bad attendence";
        }
        else{
        ma="student has a good attendence";
        }
        return ma;
    }
    
        
        
    String ViewFeedback(Student VF){
        String A= VF.getFeedback();
    return A;
    }
    
//   public void SignUp(String username,  String password, String name, String dateOfBirth, String email, String phone){
//        Teacher T= new Teacher(username,username,name,dateOfBirth, email,phone) {
//           
//           
//        };
        
        
    
    
    
    public void displayInfo(){
    
    }
    
    void UploadContent(){}
    
    void viewFeedback(){}
    
    void ReplyFeedback(){}
    
//    bool VerifyLogin(){
//        return null;
//    }
    
    
//     @Override
//            public void signUp(String username,  String password, String name, String dateOfBirth, String email, String phone) {
//                Teacher T= new Teacher(username,username,name,dateOfBirth, email,phone)
////                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
////                Teacher T= new Teacher(username,username,name,dateOfBirth, email,phone); 
//            }

            @Override
            public void verifyLogin(String username, String password) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setDateOfBirth(String dateOfBirth) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setPhone(String phone) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getDateOfBirth() {
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

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static ArrayList<Teacher> getTeachers() {
        return Teachers;
    }

    public String getMa() {
        return ma;
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
       public Teacher verifyTeacherLogin(String username, String password) {
        ArrayList<String> tempu = new ArrayList();
        ArrayList<String> tempp = new ArrayList();
        boolean f = false; 
            String url = "jdbc:derby://localhost:1527/course";

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM TEACHER";
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
