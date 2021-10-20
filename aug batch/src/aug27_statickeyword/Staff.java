package aug27_statickeyword;

public class Staff {//static block use it is not used in real time just for knowledge we are using this prgrm as exmple
					

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am from public static void main block");// main block prints after static block
	}

	static {
		System.out.println("i am from simple basic static block");// it prints first and maain block prints next as we
																	// used static block here
	}
}
