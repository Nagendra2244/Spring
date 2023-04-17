package Com.OnlineProduct.Program;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



public class ProductJDBCTemplate implements ProductDAO {

	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
	private Object description;
	private Object name;
	private Object price;
	private Object imageUrl;

@Autowired
    public void setDataSource(DataSource ds) {
        this.dataSource=ds;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }	

public void addProduct(String name, String description, double price, String imageUrl) {
	// TODO Auto-generated method stub
	String sql = "INSERT INTO products (name, description, price, image_url) VALUES (?, ?, ?, ?)";
    jdbcTemplateObject.update(sql, name, description, price, imageUrl);
    System.out.println("Product added successfully: name=" + name + ", description=" + description +
                       ", price=" + price + ", imageUrl=" + imageUrl);
}
public void updateProduct(Product product) {
		// TODO Auto-generated method stub
	String sql = "UPDATE products SET name = ?, description = ?, price = ?, image_url = ? WHERE id = ?";
    jdbcTemplateObject.update(sql, product.getName(), product.getDescription(), product.getPrice(),
            product.getImageUrl(), product.getId());
    System.out.println("Updated Record ID=" + product.getId() + ", name=" + product.getName() + ", description="
            + product.getDescription() + ", price=" + product.getPrice() + ", image_url=" + product.getImageUrl());

	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM products WHERE id = ?";
        jdbcTemplateObject.update(sql, productId);
        System.out.println("Deleted Record with ID=" + productId);	
	}
		public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM products";
        List<Product> products = jdbcTemplateObject.query(sql, new BeanPropertyRowMapper<Product>(Product.class));
        return products;
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		  String sql = "SELECT * FROM products WHERE id = ?";
	        Product product = jdbcTemplateObject.queryForObject(sql, new Object[] { id },new BeanPropertyRowMapper<Product>(Product.class));
	        return product;
	}

	
	

}
