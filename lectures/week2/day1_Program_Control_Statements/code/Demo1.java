import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		char ch;
		System.out.print("Press a key followed by enter: ");
		ch = (char) System.in.read();
		System.out.println("You pressed " + ch);
	}
}
