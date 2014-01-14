package se.coredev.zoo.data;

import java.util.Map;

public abstract class Animal
{
	private final String id;
	private final boolean isDangerous;
	private final AnimalType animalType;
	
	public Animal(String id, boolean isDangerous, AnimalType animalType)
	{
		this.id = id;
		this.isDangerous = isDangerous;
		this.animalType = animalType;
	}
	
	public String getId()
	{
		return id;
	}
	
	public boolean isDangerous()
	{
		return isDangerous;
	}
	
	public AnimalType getAnimalType()
	{
		return animalType;
	}

	// To be implemented by sub classes
	public abstract String getSound();
	public abstract Map<String, String> getAnimalData();
	
	@Override
	public boolean equals(Object other)
	{
		if(other == this){ return true; }
		
		if(other instanceof Animal)
		{
			Animal otherAnimal = (Animal) other;
			boolean isSameClass = this.getClass().equals(otherAnimal.getClass());
			
			return id.equals(otherAnimal.id) && isSameClass;
		}
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int result = 1;
		result += 37 * this.id.hashCode();
		result += 37 * this.getClass().hashCode();
		
		return result;
	}
	

}
