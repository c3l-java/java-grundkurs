package se.coredev.zoo.data;

public final class AnimalTrainer implements ZooListener
{

	@Override
	public void animalAdded(Animal animal)
	{
		System.out.println("New animal to learn");		
	}

}
