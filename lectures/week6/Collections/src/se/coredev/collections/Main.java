package se.coredev.collections;

import java.util.HashSet;
import java.util.Set;

public class Main
{

	public static void main(String[] args)
	{
		Set<User> users = new HashSet<>();
		
		User admin = new User("1001", "Master");
		User adminCopy = new User("1000", "Master");
		User adminCopyCopy = new User("1000", "Master");
		
		users.add(admin);
		users.add(adminCopy);
				
		for(User user : users)
		{
			System.err.println(String.format("%s:%s", user.getId(), user.getUsername()));
		}		

		System.err.println("------------------------------------------------------");
		adminCopy.setId("1001");
		users.add(adminCopyCopy);
		
		for(User user : users)
		{
			System.err.println(String.format("%s:%s", user.getId(), user.getUsername()));
		}		
	}
	
}
