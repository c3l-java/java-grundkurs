public class ColorTraingle1 extends Triangle1{
	private String color;
	public ColorTraingle1(double width, double height, String color) {
		super(width, height);
		this.setColor(color);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
