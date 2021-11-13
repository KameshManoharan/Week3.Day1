package Week3.Day1.org.student;

import Week3.Day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name Method");
	}
	
	public void studentDept() {
		System.out.println("Student Department Method");
	}
	
	public void studentId() {
		System.out.println("Student Id Method");
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
}
