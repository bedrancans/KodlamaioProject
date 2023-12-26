package KodlamaioProject;
import java.util.Scanner;

import KodlamaioProject.business.ProductManager;
import KodlamaioProject.core.logging.DatabaseLogger;
import KodlamaioProject.core.logging.Logger;
import KodlamaioProject.dataAccess.HibernateProductDao;
import KodlamaioProject.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("KODLAMA.IO ANASAYFA SIMULASYONUU");
		Product product1 = new Product();
		Logger[] loggers = {new DatabaseLogger()};
		Scanner scanner = new Scanner(System.in);
 		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers, scanner);
		productManager.add(product1);
		}

}