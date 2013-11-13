class PointTest{
	public static void main(String[] args){
		Point hero = new Point(20,500);
		Point banana = new Point(10,50);
		System.out.println("Hero is " + hero.getDistance(banana) + " pixels from banana.");
	}
}