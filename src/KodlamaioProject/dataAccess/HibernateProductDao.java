package KodlamaioProject.dataAccess;

import KodlamaioProject.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("hibernate ile db ye eklendi");
	}


}