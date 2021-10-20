package sep1_accessmodifiers2;

import sep1_accessmodifiers.School;

public class Student2 extends School {

	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.garden();
		obj.adminSalary();// here we can access the protected method in school coz we imported the
							// package.school and used inheritance so we can access
	
	}

}
