package com.abstractpackage;

public class Main {
	
	public static void main(String[] args) {
		
		Student2 student=new Student2();
		student.printStudentName();
		
	}

}

abstract class Student1{
	
	abstract void printStudentName();
}

class Student2 extends Student1 {

	@Override
	void printStudentName() {
		System.out.println("Student name: Aftabalam Aslam Husen Shaikh");
		
	}
	
	
	
}