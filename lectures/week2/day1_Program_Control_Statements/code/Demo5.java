import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		// Press enter to step through the loop S followed by enter to exit
		for (int i = 0; (char) System.in.read() != 'S'; i++)
			System.out.println("Pass #" + i);
		
	}

}
