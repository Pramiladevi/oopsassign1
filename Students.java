package com.examplesofoops;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}public void getStudentInfo(String name) {
		System.out.println(name);
	}public void getStudentInfo(String emailId ,long mobileNmuber) {
		System.out.println(emailId+" "+mobileNmuber);
	}

	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo(1761025);
        details.getStudentInfo("deva");
        details.getStudentInfo("deva2000@gmail.com", 12346645455L);
        details.getStudentInfo("priya");
        details.getStudentInfo("priya1999@gmail.com", 79454290849L);
        details.getStudentInfo(1761028);
        details.getStudentInfo("pavithra");
        details.getStudentInfo("pavi2003@gmail.com", 9876554543L);
	}

}
