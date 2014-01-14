package se.coredev.zoo;

import se.coredev.zoo.data.Dog;
import se.coredev.zoo.data.Wolf;
import se.coredev.zoo.data.Zebra;
import se.coredev.zoo.storage.Zoo;

public class Main
{
	public static void main(String[] args)
	{
		new Zoo().addAnimal(new Dog("1002"))
				 .addAnimal(new Dog("1003"))
				 .addAnimal(new Dog("1001"))
				 .addAnimal(new Zebra("1001"))
				 .addAnimal(new Zebra("1002"))
				 .addAnimal(new Wolf("1001", false))
				 .addAnimal(new Wolf("1004", true))
				 .addAnimal(new Wolf("1003", true))
				 .addAnimal(new Wolf("1002", false))
				 .addAnimal(new Wolf("1005", false))
				 .hearAnimalSound();
	}

}
