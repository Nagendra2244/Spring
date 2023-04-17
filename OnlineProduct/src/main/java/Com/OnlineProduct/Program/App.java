package Com.OnlineProduct.Program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    
	public static void main(String[] args) {
        // create a new Spring application context using the AppConfig class as the configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("com.onlineproduct.program");
        ProductDAO product = context.getBean(ProductDAO.class);

        

        System.out.println("---------Adding Products to  DataBase---------");

        product.addProduct("iPhone 13", "The latest iPhone from Apple", 89000.00, "https://product1.com/iphone13.jpg");
        product.addProduct("Samsung M14 5G", "Monster 5G 50MP Camera", 34000.00, "https://product2.com/samsung.jpg");
        product.addProduct("realme narzo N55", "33W SUPERVOC Charge| 64MP AI Camera", 15000.00, "https://product3.com/realme.jpg");
        product.addProduct("onePlus Nord CE 3Lite 5G", "Never Settle(Pastel Lime,8GB RAM,128GB Storage)", 21000.95, "https://product4.com/onePlus.jpg");
        product.addProduct("motorola", "The latest Version From Motorola", 1850.21, "https://product5.com/motorola.jpg");
        System.out.println("All products added");
        
        System.out.println("---------All products---------");
        
        for (Product productObj : product.getAllProducts()) {
            System.out.println(productObj);
        }

        System.out.println("---------Delete product---------");

        product.deleteProduct(3);
        System.out.println("Record with ID 3 deleted successfully!");
        
       System.out.println("---------Search product By Id---------");

        Product productById = product.getProductById(1);
        System.out.println("Product Id: " + productById.getId());
        System.out.println("Product Name: " + productById.getName());
        System.out.println("Product Description: " + productById.getDescription());
        System.out.println("Product Image: " + productById.getImageUrl());
        
 System.out.println("---------Update product on Record---------");
        
        Product productToUpdate = product.getProductById(4);
        productToUpdate.setName("Oppo Y62");
        productToUpdate.setDescription("The latest Version From Oppo");
        productToUpdate.setPrice(20000.00);
        productToUpdate.setImageUrl("https://product5.com/oppo12.jpg");
        product.updateProduct(productToUpdate);
        System.out.println("Record updated successfully!");

        // close the Spring context
        context.close();
    }
}