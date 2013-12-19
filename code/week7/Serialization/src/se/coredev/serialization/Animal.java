package se.coredev.serialization;

import java.io.Serializable;

public abstract class Animal implements Serializable
{
	private static final long serialVersionUID = 20131219L;
	private final String name;
	
//	public Animal()
//	{
//		this.name = "No name";
//	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
