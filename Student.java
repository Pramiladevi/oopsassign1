package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("deva");
	}public void studentId() {
		System.out.println("1761035");
	}public void studentDept() {
		System.out.println("metallurgy");
	}

	public static void main(String[] args) {
		Student sd=new Student();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptNmae();
		sd.studentName();
        sd.studentId();
        sd.studentDept();
	}

}
