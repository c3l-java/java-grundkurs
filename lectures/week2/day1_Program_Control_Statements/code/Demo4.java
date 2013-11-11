public class Demo4 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 1:
				System.out.println(i + " i is one");
			case 2:
				System.out.println(i + " i is two");
			case 3:
				System.out.println(i + " i is three");
			case 4:
				System.out.println(i + " i is four");
				break;
			default:
				System.out.println("i is not between 1 - 4");
			}
			System.out.println();
		}

	}
}
