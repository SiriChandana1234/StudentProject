package com.student;

public interface StudentOperation {
  public Student findStudent(int id);
  public void addStudent(Student s);
  public void updateStudent(Student s);
  public void deleteStudent(int id);

}
