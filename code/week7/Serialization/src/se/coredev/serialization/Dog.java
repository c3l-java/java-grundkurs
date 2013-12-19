package se.coredev.serialization;

import java.io.Serializable;

public class Dog extends Animal implements Serializable
{
	private static final long serialVersionUID = 20131219L;
	private String nickname;

	public Dog(String name, String nickname)
	{
		super(name);
		this.nickname = nickname;		
	}
	
	public String getNickname()
	{
		return nickname;
	}
}
