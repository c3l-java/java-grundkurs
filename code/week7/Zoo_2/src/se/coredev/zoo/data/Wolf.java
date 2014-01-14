package se.coredev.zoo.data;

import java.util.HashMap;
import java.util.Map;
import static se.coredev.zoo.data.AnimalType.WILD;

public final class Wolf extends Animal
{
	public Wolf(String id, boolean isDangerous)
	{
		super(id, isDangerous, WILD);
	}

	@Override
	public String getSound()
	{
		return "Aoooouuuiiii!";
	}

	@Override
	public Map<String, String> getAnimalData()
	{
		Map<String, String> data = new HashMap<>();
		return data;
	}

}
