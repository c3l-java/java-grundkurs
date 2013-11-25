public class TriangleTest {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.height = 50;
		tri.width = 20;
		tri.showDim();
		System.out.println("Triangle area " + tri.area());
	
		TwoDShape square = new TwoDShape();
		square.height = 35;
		square.width = 35;
		square.showDim();
	}

}
