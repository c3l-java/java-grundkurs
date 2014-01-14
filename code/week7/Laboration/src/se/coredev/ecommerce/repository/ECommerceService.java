package se.coredev.ecommerce.repository;

public final class ECommerceService
{
	private ProductRepository productRepository;

	public ECommerceService(ProductRepository productRepository)
	{
		this.productRepository = productRepository;
	}

	public void updateProduct(Product product)
	{
		productRepository.updateProduct(product);
	}
	
}
