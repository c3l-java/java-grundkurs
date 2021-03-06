package se.coredev.zoo.storage;

import static se.coredev.zoo.data.AnimalType.DOMESTIC;
import static se.coredev.zoo.data.AnimalType.WILD;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import se.coredev.zoo.data.Animal;
import se.coredev.zoo.data.AnimalType;

public final class Zoo
{
	private final Map<AnimalType, Set<Animal>> storage;

	public Zoo()
	{
		storage = new HashMap<>();
		storage.put(WILD, new LinkedHashSet<Animal>());
		storage.put(DOMESTIC, new LinkedHashSet<Animal>());
	}

	public Zoo addAnimal(Animal animal)
	{
		if(animal.isDangerous()){ return this; }
		
		storage.get(animal.getAnimalType()).add(animal);
		
		return this;
	}

	public Zoo hearAnimalSound()
	{
		for(Animal domesticAnimal : storage.get(DOMESTIC))
		{
			System.out.println(String.format("%s:%s", domesticAnimal.getId(), domesticAnimal.getSound()));
		}
		
		for(Animal wildAnimal : storage.get(WILD))
		{
			System.out.println(String.format("%s:%s", wildAnimal.getId(), wildAnimal.getSound()));
		}		
		
		return this;
	}
}
