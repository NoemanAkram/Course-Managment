

package school.course.mangment.system;
import school.course.mangment.system.Program;
import java.util.ArrayList;
import java.util.Iterator;
import school.course.mangment.system.User;
import java.sql.*;

/**
 *
 * @author ITECH
 */
public class Student extends User  {
     private int idNum ;
     private static int id = 1000;
     

 private int year;

private String parentPhone;

private double fees;

private String program;

 private char group ;

  private  double gpa ;
  
  private String feedback;
 static private int numOfDroppedModules;
   private Program p; 
    private Classroom cr; 
public  ArrayList <String> modules= new ArrayList() ;

    public  ArrayList <Student> students= new ArrayList() ;
    
//   

public Student(){
    
}

    public Student(int year, String parentPhone, double fees, String program, char group, double gpa, Program p, Classroom cr, String username, String password, String name, String dateOfBirth, String email, String phone) {
        super(username, password, name, dateOfBirth, email, phone);
        this.year = year;
        this.parentPhone = parentPhone;
        this.fees = fees;
        this.program = program;
        this.group = group;
        this.gpa = gpa;
        this.p = p;
        this.cr = cr;
        
           this.idNum = id+1; 
           this.id++;
              this.cr.addStudent(this);
        this.p.addStudent();
InsertStudent();
    }

 
    

    
    

    
    
    public void InsertStudent(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "INSERT INTO STUDENT VALUES('"+this.name+"',"+this.id+" ,'"+this.username+"', '"+this.password+"','"+this.p.getName()+" ')";
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
        
    }
         public void retrieveStudent(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM STUDENT";
Statement st = con.createStatement();
ResultSet rs=null;
rs=st.executeQuery(sql);
while(rs.next()){
System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("username")+"\t"+rs.getString("password")+"\t"+rs.getString("program"));
}
rs.close();
st.close();
con.close();
} catch (SQLException ex) {
System.out.println(ex);}
        
    }
         
          public void deleteStudent(){
        
    String url = "jdbc:derby://localhost:1527/course";
                   

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
            Statement st = con.createStatement();
             String st1 = "DELETE FROM STUDENT WHERE ID="+Integer.toString(this.id);
            System.out.println(st1);
            st.execute(st1);
        st.close();
        con.close();
        }catch(Exception e){
            System.out.println(e);

    }
          }
//    public Student(String id, int year, String parentPhone, double fees, String program, char group, double gpa) {
//        this.id = id;
//        this.year = year;
//        this.parentPhone = parentPhone;
//        this.fees = fees;
//        this.program = program;
//        this.group = group;
//        this.gpa = gpa;
//    }
          
          public void changeProgram(Program pp){
              if(this.p.getName()!=pp.getName()){
              this.p.removeStudent();
              this.p = pp; 
              pp.addStudent();
              }
          }

    public static int getId() {
        return id;
    }

    
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getFeedback() {
        return feedback;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", year=" + year + ", parentPhone=" + parentPhone + ", fees=" + fees + ", program=" + program + ", group=" + group + ", gpa=" + gpa + '}';
    }
    
    String chooseprogram(String p, Student s) {
        String a;
        Program p1= new Program();
       if (s.getGpa() >= p1.check_min_gpa(p)){
           a="Your program has been chosen successfully";
           p1.addStudent();
//           s.setProgram(p);
//            System.out.println(s.getProgram());
           //Iterator<Student> o= p1.students.iterator();
//       
//            while (o.hasNext()){
//                
//        
////         
////          
//                  System.out.println(o.next());
//               
//          
//}
//            System.out.println(s.getProgram());
}
       
       else{
          a="Your GPA is less than the minimum GPA for this program";
       }
       return a;
            } 
    
    
    void Add_module(String m, Student s){
     
        Iterator<String> o= s.modules.iterator();
      
           while (o.hasNext()){
             if(o.next()== m) { 
                 System.out.println("you conot add this module");        
           }
             return;
      }     
        if(s.modules.size()< 5){
    s.modules.add(m);
            System.out.println("Done"); 
        }
        else{
            System.out.println("You canot add more than 5 modules");
        }
        
    }
    
    
    
//     static void Drop_module(String m, Student s ){
//      String a;
//     if (numOfDroppedModules<2){
//    s.modules.remove(m);
//    numOfDroppedModules++;
//         System.out.println("Done");
//         
//     }
//     else
//     {
//         
//         System.out.println("You cannot drop any more modules");
//     }
//     
//    }
     public void add_module(Module m,String s){
     m.setName(s);
     }
     
//     
//     void manage_course(String s, Student s1, String m){
//         String a;
//         if(s== "Add"){
//         s1.Add_module(m, s1);
//         }
//         else {
//         s1.Drop_module (m, s1 );
//         }
//          
//     }
     
    public void submitFeedback(String s){
         setFeedback(s);
         
     }
     
     @Override
     public void displayInfo(){
         
         System.out.println("Id:"+"\n"+id);
         System.out.println("Year:"+"\n"+year);
         System.out.println("Parent Phone:"+"\n"+parentPhone);
         System.out.println("fees:"+"\n"+fees);
         System.out.println("program:"+"\n"+program);
         System.out.println("Group:"+"\n"+group);
         System.out.println("GPA:"+"\n"+gpa);
         System.out.println("number Of Dropped Modules:"+"\n"+numOfDroppedModules);
     }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Student verifyStudentLogin(String username, String password) {
        ArrayList<String> tempu = new ArrayList();
        ArrayList<String> tempp = new ArrayList();
        boolean f = false; 
            String url = "jdbc:derby://localhost:1527/course";

        try{
            Connection con = DriverManager.getConnection(url,"bue","buee");
           String sql = "SELECT * FROM STUDENT";
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
        return name;
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

    public static int getNumOfDroppedModules() {
        return numOfDroppedModules;
    }

    public Program getP() {
        return p;
    }

    public Classroom getCr() {
        return cr;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }

    @Override
    public void verifyLogin(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdNum() {
        return idNum;
    }
    
}
