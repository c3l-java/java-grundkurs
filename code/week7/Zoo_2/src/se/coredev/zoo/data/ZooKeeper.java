package se.coredev.zoo.data;

public final class ZooKeeper implements ZooListener
{

	@Override
	public void animalAdded(Animal animal)
	{
		System.out.println("Animal marked!");		
	}

}
