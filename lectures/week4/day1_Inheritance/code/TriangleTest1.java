public class TriangleTest1 {

	public static void main(String[] args) {
		Triangle1 tri = new Triangle1(50, 20);
		tri.showDim();
		System.out.println("Triangle area " + tri.area());
		
		TwoDShape1 shp = new Triangle1(50, 50);
		System.out.println("Triangle area " + shp.area());
		
	}

}
