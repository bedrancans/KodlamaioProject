package KodlamaioProject.dataAccess;

import KodlamaioProject.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("jdbc ile veri eklendi");
		
	}

}
 
