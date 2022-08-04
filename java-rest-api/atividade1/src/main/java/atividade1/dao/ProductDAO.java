package atividade1.dao;

import java.util.List;

import atividade1.entities.Product;

public interface ProductDAO {

    public void save(Product entity);
    
    public void delete(int id);
 
    public Product find(int id);
    
    public List<Product> findAll();
    
    public Product findByName(String str);
 
    public List<Product> findAllByName(String str);
	
}
