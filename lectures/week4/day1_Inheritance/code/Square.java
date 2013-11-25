public class Square extends TwoDShape {
	boolean isSquare(){
		return (width == height); 
	}
	double area() {
		return width * height;
	}
	
}
