package br.ufc.mandacaru.springProject.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufc.mandacaru.springProject.model.Product;

public class ProductMemoryDAO implements ProductDAO {
	private Map<Integer, Product> products = new HashMap<Integer, Product>();
	int i = 0;

	@Override
	public void save(Product entity) {
		if(entity.getId() == 0) {
			i++;
			entity.setId(i);	
		}
		
		products.put(entity.getId(), entity);
	}

	@Override
	public void delete(int id) {
		products.remove(id);
	}

	@Override
	public Product find(int id) {
		return products.get(id);
	}

	@Override
	public List<Product> findAll() {
		return new ArrayList<Product>(products.values());
	}

	@Override
	public Product findByName(String str) {
		for (Product product : products.values()) {
			if(product.getName().equals(str)) {
				return product;
			}
		}

		return null;
	}

	@Override
	public List<Product> findAllByName(String str) {
		List<Product> listProducts = new ArrayList<Product>();
		
		for (Product product : products.values()) {
			if(product.getName().equals(str)) {
				listProducts.add(product);
			}
		}

		return null;
	}
}
