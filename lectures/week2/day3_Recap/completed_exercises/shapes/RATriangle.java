class RATriangle {
	double width;
	double height;
	RATriangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	double getArea(){
		return (width * height)/2;
	}
	double getHypotenuseLength(){
		return Math.sqrt((width * width) + (height * height));
	}
	double getPerimeterLength(){
		return  width + height + getHypotenuseLength();
	}
}