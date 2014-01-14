package se.coredev.zoo;

public class Main
{
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();
		
		zoo.addAnima(new Dog());
		zoo.addAnima(new Dog());
		zoo.addAnima(new Dog());
		zoo.addAnima(new Dog());
		zoo.addAnima(new Cat());
		zoo.addAnima(new Cat());
		zoo.addAnima(new Cat());
		zoo.addAnima(new Zebra());
		zoo.addAnima(new Zebra());
		
		zoo.hearAnimalSound();
	}
}
