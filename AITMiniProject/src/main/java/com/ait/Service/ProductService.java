package com.ait.Service;

import java.util.List;

import com.ait.Model.Product;


public interface ProductService {

	
	boolean insertProduct(Product p);

	boolean deleteProduct(Product p);

	boolean updateProduct(Product p);

	List<Product> getAllProducts();

	Product getProductById(int id);
}
