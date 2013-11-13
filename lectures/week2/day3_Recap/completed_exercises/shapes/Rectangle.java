class Rectangle{
	double width;
	double height;
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	double getArea(){
		return width * height;
	}
	double getPerimeterLength(){
		return (2 * width) + (2 * height);
	}
}