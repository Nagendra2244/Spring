package Com.OnlineProduct.Program;

import java.util.List;

public interface ProductDAO {

	public void addProduct(String name, String description, double price, String imageUrl);
	public void updateProduct(Product product);
	public void deleteProduct(int productId);
    public List<Product> getAllProducts();
	public Product getProductById(int productId);
		
	
}
