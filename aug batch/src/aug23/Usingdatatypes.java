package aug23;

public class Usingdatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usingdatatypes obj = new Usingdatatypes();
		String collegeName = obj.nameOfTheCollege();
		System.out.println("Name of the college is  " + collegeName);

		int lecSalary = obj.LecSalaries();

		System.out.println("Lec salary is " + lecSalary);

		int tot_Salary = obj.bonus(lecSalary);
		System.out.println("Total salary is with Bonus is  " + tot_Salary);
	}

	String nameOfTheCollege() {
		String name = "MallaReddy Engg College";
		return name;
	}

	int LecSalaries() {
		return 25000;
	}

	int bonus(int salary) {
		int bonusToEmp = 10000;
		int tot_Salary = bonusToEmp + salary;
		return tot_Salary;
	}
}
