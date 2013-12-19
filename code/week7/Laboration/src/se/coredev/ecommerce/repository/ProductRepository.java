package se.coredev.ecommerce.repository;

public interface ProductRepository
{
	void addProduct(Product product);
	
	Product updateProduct(Product product);
}
