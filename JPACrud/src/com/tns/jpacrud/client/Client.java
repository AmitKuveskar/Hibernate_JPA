package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;


public class Client 
{

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation	
//	student.setStudentid(3);
//	student.setName("Kuveskar ");
//	service.addStudent(student);
//		
		
	// Retrieve Operation
	//	service.findStudentById(1);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
		student  =service.findStudentById(1);
		student.setName("Amit ");
		service.updateStudent(student);	
		
//		service.findStudentById(2);
//		System.out.println("ID is: "+student.getStudentid());
//		System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
//		student=service.findStudentById(1);
//		service.removeStudent(student);
//		System.out.println("Row removed");
		
		
	}

}
