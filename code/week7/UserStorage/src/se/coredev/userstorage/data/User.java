package se.coredev.userstorage.data;

public final class User
{
	private String id;
	private String username;
	private String password;

	public User(String id, String username, String password)
	{
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public String getId()
	{
		return id;
	}

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	@Override
	public boolean equals(Object other)
	{
		if (this == other){	return true;}
		
		if (other instanceof User)
		{
			User otherUser = (User) other;
			return this.id.equals(otherUser.id);
		}		

		return false;
	}
	
	@Override
	public int hashCode()
	{
		return 37 * id.hashCode();
	}
	
	@Override
	public String toString()
	{
		return String.format("Id:%s, Username:%s", id, username);
	}
	
}
