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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

}
