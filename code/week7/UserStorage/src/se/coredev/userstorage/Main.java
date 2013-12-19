package se.coredev.userstorage;

import se.coredev.userstorage.data.User;

public class Main
{

	public static void main(String[] args)
	{
		UserStorage userStorage = new UserStorage();
		try
		{
			userStorage.addUser(new User("1001", "Master", "secret"))
					   .addUser(new User("1001", "Master", "secret"));
			
			User userFromStorage = userStorage.getUser("1001");
			
			System.out.println(userFromStorage);
		}
		catch (StorageException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
