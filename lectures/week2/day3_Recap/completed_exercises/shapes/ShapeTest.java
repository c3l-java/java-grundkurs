class ShapeTest {
	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(10,20);
		Rectangle square = new Rectangle(200,200); 
		Circle smallCircle = new Circle(5.1);
		Circle largeCircle = new Circle(2000343.3);
		RATriangle smallTriangle = new RATriangle(10,20);
		RATriangle largeTriangle = new RATriangle(34534,3994858);

		System.out.println("Rectangle");
		System.out.println("Width: "+ rectangle.width);
		System.out.println("Height: "+ rectangle.height);
		System.out.println("Area: "+ rectangle.getArea());
		System.out.println("Perimeter: "+ rectangle.getPerimeterLength());
		
		System.out.println();

		System.out.println("Square");
		System.out.println("Width: "+ square.width);
		System.out.println("Height: "+ square.height);
		System.out.println("Area: "+ square.getArea());
		System.out.println("Perimeter: "+ square.getPerimeterLength());
		
		System.out.println();
		
		System.out.println("Small Circle");
		System.out.println("Radius: "+ smallCircle.radius);
		System.out.println("Diameter: "+ smallCircle.getDiameter());
		System.out.println("Area: "+ smallCircle.getArea());
		System.out.println("Circumference: "+ smallCircle.getCircumference());
		
		System.out.println();
		
		System.out.println("Large Circle");
		System.out.println("Radius: "+ largeCircle.radius);
		System.out.println("Diameter: "+ largeCircle.getDiameter());
		System.out.println("Area: "+ largeCircle.getArea());
		System.out.println("Circumference: "+ largeCircle.getCircumference());

		System.out.println();

		System.out.println("Small Triangle");
		System.out.println("Width: "+ smallTriangle.width);
		System.out.println("Height: "+ smallTriangle.height);
		System.out.println("Area: "+ smallTriangle.getArea());
		System.out.println("Perimeter: "+ smallTriangle.getPerimeterLength());
		System.out.println("Hypotenuse: "+ smallTriangle.getHypotenuseLength());
		
		System.out.println();

		System.out.println("Large Triangle");
		System.out.println("Width: "+ largeTriangle.width);
		System.out.println("Height: "+ largeTriangle.height);
		System.out.println("Area: "+ largeTriangle.getArea());
		System.out.println("Perimeter: "+ largeTriangle.getPerimeterLength());
		System.out.println("Hypotenuse: "+ largeTriangle.getHypotenuseLength());
		
	}
}