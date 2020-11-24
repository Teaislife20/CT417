package SoftwareEng;


import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CourseTest {
    
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

    
    public CourseTest() {
        
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    /*
    @Test
    public void testAddModule() {
       
        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student2);
        module2.addStudent(student3);
        Module module = module1;
        Module module3 = module2;
        Course instance = course1;
        instance.addModule(module);
        instance.addModule(module3);
        course1.printStudentDetails();
    }
*/
   
    @Test
    public void testGetCourseName() {
      
        Course instance = course1;
        String expResult = "CS & IT";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

   
    @Test
    public void testAddStudent() {
       
        Student student = student4;
        Course instance = course1;
        instance.addStudent(student);
    }

   
    @Test
    public void testPrintStudentUsernames() {
       
        
        Course instance = course1;
       
        instance.addStudent(student1);
        instance.printStudentUsernames();
    }

   
    @Test
    public void testPrintModuleList() {
       
        Course instance = course1;
        instance.addModule(module1);
        instance.printModuleList();
    }

   
    @Test
    public void testGetStartDate() {
       
        Course instance = course1;
        DateTime expResult = startDate;
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
    }

   
    @Test
    public void testGetEndDate() {
      
        Course instance = course1;
        DateTime expResult = endDate;
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
    }

   /*
    @Test
    public void testPrintStudentDetails() {
      
        Course instance = course1;
        instance.printStudentDetails();
    }
*/
       
}