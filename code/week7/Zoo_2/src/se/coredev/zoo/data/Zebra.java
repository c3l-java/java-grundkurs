package se.coredev.zoo.data;

import java.util.HashMap;
import java.util.Map;
import static se.coredev.zoo.data.AnimalType.WILD;

public final class Zebra extends Animal
{
	public Zebra(String id)
	{
		super(id, false, WILD);
	}

	@Override
	public String getSound()
	{
		return "Whaiiwhaouk";
	}

	@Override
	public Map<String, String> getAnimalData()
	{
		Map<String, String> data = new HashMap<>();
		return data;
	}

}
