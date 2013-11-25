public abstract class TwoDShape1 {
	private double width;
	private double height;
	public TwoDShape1(double width, double height) {
	System.out.println("2DShep") ;
	this.setWidth(width);
	 this.setHeight(height);
	}
	public void showDim() {
		System.out.println("Width and height are "+ getWidth() + " and " + getHeight());
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public abstract double area();
}
