package SoftwareEng;

import java.util.ArrayList;

public class Module {
//Q1: Part b|A module class, which should contain information such as module name, id (e.g.CT417), list of students, courses it is associated with)
	 private String moduleName;
	 private String moduleID;
		private ArrayList<Student> studentList = new ArrayList<Student>();

	    public Module(String moduleName, String moduleID) {
	        this.moduleName = moduleName;
	        this.moduleID = moduleID;
	    }

	    public String getModuleDetails() {
	        return moduleID + " - " + moduleName;
	    }

	    public boolean addStudent(Student student) {
	        if (!studentList.contains(student)) {
	            studentList.add(student);
	            student.addModule(this);
	        }
	        return true;
	    }

	    public void printStudentList() {
	        for (Student student : studentList) {
	            System.out.println(student.getUserName());
	        }
	    }
	    
	    public void printStudentDetails() {
	        for (Student student : studentList) {
	            student.printStudentDetails();
	        }
	    }
	    

	    public ArrayList<Student> getStudents() {
	        return this.studentList;
	    }


	    public String getModuleName() {
	        return moduleName;
	    }

	    public String getModuleID() {
	        return moduleID;
	    }
	}

