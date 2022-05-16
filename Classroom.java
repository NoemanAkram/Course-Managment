package school.course.mangment.system;

import java.util.ArrayList;


public class Classroom {
// Variables 
    private char classNum; 
    private ArrayList <Student> students = new ArrayList(); 
    private static int numOfStudents; 
    private int capacity;
// Constructor 
    public Classroom(char classNum, int capacity) {
        this.classNum = classNum;
        this.numOfStudents = 0;
        this.capacity = capacity;
       
    }
// Methods
    public void addStudent(Student x){
        this.students.add(x);
        numOfStudents++; 
    }
    
    
// Setters and getters
    
    public char getClassNum() {
        return classNum;
    }

    public void setClassNum(char classNum) {
        this.classNum = classNum;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    public static void setNumOfStudents(int numOfStudents) {
        Classroom.numOfStudents = numOfStudents;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
}
