package com.student;
import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
	
	   StudentOperation ops = new StudentImplementation();
	   
	   Scanner sc=new Scanner(System.in);
	   
       while (true) {
           System.out.println("\n===== Student Operations =====");
           System.out.println("1. Find Student by ID");
           System.out.println("2. Add Student");
           System.out.println("3. Update Student");
           System.out.println("4. Delete Student");
           System.out.println("5. Exit");
           System.out.print("Enter your choice: ");
           

           int choice = sc.nextInt();

           switch (choice) {
           
              case 1:{
            	   //Find a student 
            	  System.out.println("Enter ID to search: ");
            	  int findId= sc.nextInt();
            	  Student found =ops.findStudent(findId);
            	  System.out.println(found !=null ? found : "student not found.");
            	  
            	  break;
              }
              case 2:{
            	// Add students
            	  
            	  
            	  break;
              }
              case 3:{
           	        //Update a student
            	  
            	  
            	  break;
              }
              case 4:{
            	  //delete a student
            	  
           	   
            	  break;
              }
              case 5:{
            	  System.out.println("Exiting... Goodbye!");
                  sc.close();
                  return;
              }
              default:{
            	  System.out.println("Invalid choice");
            	  
              }
           }

	   
       }   
}
}
