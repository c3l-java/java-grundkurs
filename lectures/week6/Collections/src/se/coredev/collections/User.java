package se.coredev.collections;

public final class User
{
	private String id;
	private String username;

	public User(String id, String username)
	{
		this.id = id;
		this.username = username;		
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}
	
	@Override
	public boolean equals(Object other)
	{
		System.err.println("equals");
		if(other == this){ return true; }
		
		if(other instanceof User)
		{
			User otherUser = (User) other;
			return this.id.equals(otherUser.id) && this.username.equals(otherUser.username);
		}		
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		System.err.println("hashCode");
		int result = 1;
		result += id.hashCode() * 37; 
		result += username.hashCode() * 37;
		
		return result;
	}
	
	
	
	
}
