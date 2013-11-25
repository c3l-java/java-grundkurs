public class Triangle1 extends TwoDShape1{
	public Triangle1(double width, double height) {
	   super(width, height);
	}
	public double area(){
		return super.getWidth() * super.getHeight() / 2;
	}
}
