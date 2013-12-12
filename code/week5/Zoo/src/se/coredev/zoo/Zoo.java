package se.coredev.zoo;

import java.util.Arrays;

public final class Zoo
{
	private static final int INCREMENT_STORAGE_SIZE = 5;
	private static final int DEFAULT_STORAGE_SIZE = 5;

	private Animal[] animalStorage;
	private int nextIndex;
	
	public Zoo()
	{
		this(DEFAULT_STORAGE_SIZE);
	}

	public Zoo(int initialStorageSize)
	{
		animalStorage = new Animal[initialStorageSize];
		nextIndex = 0;		
	}

	public void addAnima(Animal animal)
	{
		if(needToExpandStorage())
		{
			animalStorage = expandStorageCapacity();
		}
		animalStorage[nextIndex] = animal;
		nextIndex++;
	}

	public void hearAnimalSound()
	{
		for(Animal animal : animalStorage)
		{
			if(animal == null) { break; }
			animal.sound();
		}
	}
	
	private boolean needToExpandStorage()
	{
		return nextIndex == animalStorage.length;
	}
	
	private Animal[] expandStorageCapacity()
	{
//		Animal[] expandedAnimalStorage = new Animal[animalStorage.length + INCREMENT_STORAGE_SIZE];
//		System.arraycopy(animalStorage, 0, expandedAnimalStorage, 0, animalStorage.length);
//		return expandedAnimalStorage;
		return Arrays.copyOf(animalStorage, animalStorage.length + INCREMENT_STORAGE_SIZE);
	}
	
	
	
	
	
	

}
