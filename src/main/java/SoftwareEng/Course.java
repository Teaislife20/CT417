package SoftwareEng;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
//Q1:Part c| A course programme class containing course name (CS & IT or ECE, etc.), list of modules, list of students that are enrolled, academic start date and end date. 
    private String courseName;
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private ArrayList<Module> Modules = new ArrayList();
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private ArrayList<Student> Students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;
    
    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void addModule(Module module) {
        if (!Modules.contains(module)) {
            Modules.add(module);
            ArrayList<Student> ModuleStudents = module.getStudents();
            for (Student student : ModuleStudents) {
                if (!Students.contains(student)) {
                    Students.add(student);
                    student.addCourse(this);
                }
            }
        }
    }
    
    public void addStudent(Student student) {
        if (!Students.contains(student)) {
            Students.add(student);
        }
    }
    
    public void printStudentUsernames() {
        for (Student student : Students) {
            System.out.println(student.getUserName());
        }
    }
    
    public void printStudentDetails() {
        for (Student student : Students) {
            student.printStudentDetails();
        }
    }
    
    public void printModuleList() {
        for (Module module : Modules) {
            System.out.println(module.getModuleDetails());
        }
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public DateTime getStartDate() {
        return this.startDate;
    }
    
    public DateTime getEndDate() {
        return this.endDate;
    }
}
