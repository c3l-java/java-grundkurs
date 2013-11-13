class Circle {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	double getArea(){
		return Math.PI * (radius * radius);
	}
	double getDiameter(){
		return radius * 2;
	}
	double getCircumference(){
		return Math.PI * getDiameter();
	}
}