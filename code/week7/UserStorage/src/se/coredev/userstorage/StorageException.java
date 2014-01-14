package se.coredev.userstorage;


public final class StorageException extends Exception
{	
	private static final long serialVersionUID = 20131219L;
	private final String storageKey;

	public StorageException(String message)
	{
		super(message);
		this.storageKey = null;
	}
	
	public StorageException(String message, Throwable throwable)
	{
		super(message, throwable);
		this.storageKey = null;
	}
	
	public StorageException(String message, String storageKey)
	{
		super(message);
		this.storageKey = storageKey;
	}
	
	public StorageException(String message, Throwable throwable, String storageKey)
	{
		super(message, throwable);
		this.storageKey = storageKey;
	}
	
	public String getStorageKey()
	{
		return storageKey;
	}	
}
