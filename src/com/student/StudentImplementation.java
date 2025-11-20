package com.student;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation implements StudentOperation{
  
	private List<Student> students = new ArrayList<>();
	
	@Override
	public Student findStudent(int id) {
	  for(Student s :students) {
		  if(s.getId()==id) {
			  return s;
		  }
	  }
	  return null;
	}

	@Override
	public void addStudent(Student s) {
	
	        if (findStudent(s.getId()) == null) {
	            students.add(s);
	            System.out.println("Student added.");
	        } else {
	            System.out.println("Student with ID " + s.getId() + " already exists!");
	        }
	    }
		
	

	@Override
			public void updateStudent(Student updatedStudent) {
	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).getId() == updatedStudent.getId()) {
	                students.set(i, updatedStudent);
	                System.out.println("Student updated successfully.");
	                return;
	            }
	        }
	        System.out.println("Student not found for update.");
	    }
	

	@Override
    public void deleteStudent(int id) {
        Student found = findStudent(id);
        if (found != null) {
            students.remove(found);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found for deletion.");
        }
    }

}
