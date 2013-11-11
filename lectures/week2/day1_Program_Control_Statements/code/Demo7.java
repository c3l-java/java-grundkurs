public class Demo7 {

	public static void main(String[] args) {
		int j = 1;
		done : for (int i = 0; i < 10; i++) {
			j *= 2;
			System.out.println(i);
			while (j > 20) {
				j++;
				System.out.println(j);
				if(j > 200) break done; // Add the done label as part two
			}
		}

	}

}
