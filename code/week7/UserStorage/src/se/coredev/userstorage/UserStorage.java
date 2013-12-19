package se.coredev.userstorage;

import java.util.HashMap;
import java.util.Map;

import se.coredev.userstorage.data.User;

public final class UserStorage
{
	private Map<String, User> users;

	public UserStorage()
	{
		users = new HashMap<>();
	}
	
	public UserStorage addUser(User user) throws StorageException
	{
		if(users.containsKey(user.getId()))
		{
			throw new StorageException("User with id:" + user.getId() + " exist in storage");
		}
		users.put(user.getId(), user);
		
		return this;
	}
	
	public User getUser(String userId) throws StorageException
	{
		if(users.containsKey(userId))
		{
			return users.get(userId);
		}

		throw new StorageException("No user with id:" + userId + " in storage");
	}
}
