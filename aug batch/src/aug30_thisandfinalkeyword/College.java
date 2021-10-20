package aug30_thisandfinalkeyword;

public class College {
	String collegename = "MRIT";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj = new College();
		obj.dispaly("CBIT");

	}

	void dispaly(String collegename) {                                  
		System.out.println("name of the college is " + collegename);
		System.out.println("name of the college is " + this.collegename);//here we used this keyword and accessed the instvariable college name
		this.studentinfo();//here we use this key word and called the studentinfo method in display method we acn call a method with in a method
	}

	void studentinfo() {
		System.out.println("total number of students are 1000");

	}

	

}
