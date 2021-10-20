package aug19;

public class Forloopwithbreak {
	public static void main(String args[]) {
		int table = 2;
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				break;
			}
			System.out.println(table * i);
		}

		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				break;
			}

			System.out.println(i);
		}

	}
}
