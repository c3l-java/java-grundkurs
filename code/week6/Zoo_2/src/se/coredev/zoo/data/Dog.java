package se.coredev.zoo.data;

import java.util.HashMap;
import java.util.Map;
import static se.coredev.zoo.data.AnimalType.DOMESTIC;

public final class Dog extends Animal
{
	public Dog(String id)
	{
		super(id, false, DOMESTIC);
	}

	@Override
	public String getSound()
	{
		return "Woof!";
	}

	@Override
	public Map<String, String> getAnimalData()
	{
		final Map<String, String> data = new HashMap<>();
		// Add data
		return data;
	}

}
