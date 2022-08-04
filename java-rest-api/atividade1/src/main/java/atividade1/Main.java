package atividade1;

import java.util.List;

import atividade1.dao.ProductDAO;
import atividade1.dao.ProductJDBCDAO;
import atividade1.entities.Product;
import atividade1.dao.ProductHibernateDAO;

public class Main {
	
	public static void main(String[] args ) {

		ProductDAO productDAO = new ProductHibernateDAO();
		 
        Product jardins = new Product(0, "Casa 2", "Rua 2", 0, 0, 0, 0, 0, 0);
 
        // Add 
        productDAO.save(jardins);
 
        // Find 
        Product auxProduct = productDAO.find(1);
        System.out.println(auxProduct);
 
        // Find by Name 
        Product auxProduct2 = productDAO.findByName("jardins");
        System.out.println(auxProduct2);
 
        // Find All 
        List<Product> list = productDAO.findAll();
        System.out.println(list);
 
        // Find All by Name 
        list = productDAO.findAllByName("jardins");
        System.out.println(list);
 
        // Update 
        Product auxProduct3 = productDAO.find(1);
        auxProduct3.setName("Terreno 1");
        auxProduct3.setPrice(10000);
        productDAO.save(auxProduct3);
        System.out.println(auxProduct3);
 
        // Delete
        //productDAO.delete(4);
      

	}
}
