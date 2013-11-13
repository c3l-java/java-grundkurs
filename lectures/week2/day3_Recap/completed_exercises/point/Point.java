class Point {
	double x;
	double y;
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	int getDistance(Point point){
		double width, height;
		width = point.x  - this.x;
		height = point.y - this.y;
		return (int)Math.sqrt((width * width) + (height * height));
	}
}