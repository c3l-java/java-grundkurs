package se.coredev.ecommerce.repository;

import java.util.Map;

public final class InMemoryProductRepository implements ProductRepository
{
	private Map<Long, Product> products;
	
	@Override
	public void addProduct(Product product)
	{
		
	}

	@Override
	public Product updateProduct(Product product)
	{
		return null;
	}

}
