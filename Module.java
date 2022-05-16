/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.course.mangment.system;

/**
 *
 * @author ITECH
 */
public class Module {
    private String Name;
    private int id;
    private int numofExams;
    private String finalExampercentage;

    public Module(String Name, int id, int numofExams, String finalExampercentage) {
        this.Name = Name;
        this.id = id;
        this.numofExams = numofExams;
        this.finalExampercentage = finalExampercentage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumofExams() {
        return numofExams;
    }

    public void setNumofExams(int numofExams) {
        this.numofExams = numofExams;
    }

    public String getFinalExampercentage() {
        return finalExampercentage;
    }

    public void setFinalExampercentage(String finalExampercentage) {
        this.finalExampercentage = finalExampercentage;
    }
    
    
}
