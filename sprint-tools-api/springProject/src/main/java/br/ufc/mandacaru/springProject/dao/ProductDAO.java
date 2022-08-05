package br.ufc.mandacaru.springProject.dao;

import java.util.List;

import br.ufc.mandacaru.springProject.model.Product;

public interface ProductDAO {
	
	public void save(Product entity);
	 
    public void delete(int id);
 
    public Product find(int id);
 
    public List<Product> findAll();
    
    public Product findByName(String str);
 
    public List<Product> findAllByName(String str);
}