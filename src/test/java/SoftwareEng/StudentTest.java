package SoftwareEng;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;

public class StudentTest {
    
    DateTime TestDOB = new DateTime(1998, 07, 31, 11, 0);
    
    DateTime startDate = new DateTime(2017, 8, 28, 0, 0);
    DateTime endDate = new DateTime(2021, 6, 30, 0, 0);
    
    Student student1 = new Student("Edward", 17412542, TestDOB);
    Student student2 = new Student("James", 17412500, TestDOB);
    Student student3 = new Student("Leon", 16218754, TestDOB);
    Student student4 = new Student("Tony", 15987532, TestDOB);
    
    Module module1 = new Module("Information Retrieval", "CT4100");
    Module module2 = new Module("Machine Learning", "CT4101");
    
    Course course1 = new Course("CS & IT", startDate, endDate);
    public StudentTest() {
    }
    
    
    @org.junit.jupiter.api.Test
    public void testGetUserName() {
        Student instance = student1;
        String expResult = "Edward22";
        String result = instance.getUserName();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetAge() {
        Student instance = student1;
        int expResult = 22;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

   
    @Test
    public void testAddModule() {
        
        Module module = module1;
        Student instance = student1;
        instance.addModule(module);
    }

   
    @Test
    public void testAddCourse() {
       
        Course course = course1;
        Student instance = student1;
        boolean expResult = true;
        boolean result = instance.addCourse(course);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testPrintStudentDetails() {
       
        Student instance = student1;
        student1.addCourse(course1);
        student1.addModule(module1);
        instance.printStudentDetails();
    }
}
