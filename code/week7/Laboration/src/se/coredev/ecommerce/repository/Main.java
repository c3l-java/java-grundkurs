package se.coredev.ecommerce.repository;

public class Main
{
	public static void main(String[] args)
	{
		ProductRepository productRepository = new InMemoryProductRepository();
		ECommerceService eCommerceService = new ECommerceService(productRepository);
		
		Product product = new Product();
		eCommerceService.updateProduct(product);
	}
}
