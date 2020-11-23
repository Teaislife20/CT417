package SoftwareEng;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class ModuleTest {
    
	DateTime TestDOB = new DateTime(1998, 07, 31, 11, 0);
    
	Student student1 = new Student("Edward", 17412542, TestDOB);
    Student student2 = new Student("James", 17412500, TestDOB);
    Student student3 = new Student("Leon", 16218754, TestDOB);
    
    Module module1 = new Module("Information Retrieval", "CT4100");
    Module module2 = new Module("Machine Learning", "CT4101");
    
    public ModuleTest() {
    }
    
    
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = student1;
        Module instance = module1;
        boolean expResult = true;
        boolean result = instance.addStudent(student);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testPrintStudentList() {
        System.out.println("printStudentList");
        Module instance1 = module1;
        @SuppressWarnings("unused")
		Module instance2 = module2;
        instance1.addStudent(student1);
        instance1.addStudent(student2);
        instance1.printStudentList();
    }

    
    @Test
    public void testGetModuleDetails() {
        System.out.println("getModuleDetails");
        Module instance = module1;
        String expResult = "CT4100 - Information Retrieval";
        String result = instance.getModuleDetails();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testPrintStudentDetails() {
        System.out.println("printStudentDetails");
        Module instance = module2;
        instance.printStudentDetails();
    }

    
    @SuppressWarnings("unchecked")
	@Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = module1;
        module1.addStudent(student1);
        @SuppressWarnings("rawtypes")
		ArrayList<Student> expResult = new ArrayList();
        expResult.add(student1);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = module1;
        String expResult = "Information Retrieval";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetModuleID() {
        System.out.println("getModuleID");
        Module instance = module2;
        String expResult = "CT4101";
        String result = instance.getModuleID();
        assertEquals(expResult, result);
    }
    
}
