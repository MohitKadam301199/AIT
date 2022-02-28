package com.ait.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.Dao.ProductDao;
import com.ait.Model.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean insertProduct(Product p) {
		return pdao.insertProduct(p);
	}

	@Override
	public boolean deleteProduct(Product p) {
		return pdao.deleteProduct(p);
	}

	@Override
	public boolean updateProduct(Product p) {
		return pdao.updateProduct(p);
	}

	@Override
	public List<Product> getAllProducts() {
		return pdao.getAllProducts();
	}

	@Override
	public Product getProductById(int id) {
		return pdao.getProductById(id);
	}

	
	
}
