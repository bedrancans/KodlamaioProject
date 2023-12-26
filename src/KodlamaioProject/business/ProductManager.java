package KodlamaioProject.business;
import KodlamaioProject.dataAccess.ProductDao;

import java.util.Scanner;

import KodlamaioProject.core.logging.Logger;
import KodlamaioProject.entities.Product;

public class ProductManager
{
	private ProductDao productDao;
	private Logger[] loggers;
	private Scanner scanner;
	
	public ProductManager(ProductDao productDao, Logger[] loggers, Scanner scanner) 
	{
		this.productDao = productDao;
		this.loggers = loggers;
		this.scanner = scanner;
	}
	
	String [][] data;
	int currentIndex = 0;


	public void add(Product product1)  
	{
        System.out.print("Kaç adet veri gireceksiniz? ");
        int maxVeri = scanner.nextInt();
        scanner.nextLine();
        
        data = new String[maxVeri][4];
		
		while (currentIndex<maxVeri) 
		{
			System.out.println("Veri #" + (currentIndex + 1));
			
			System.out.println("Egitmen adı giriniz (çıkmak için exit yazabilirsiniz): ");
			String egitmenAdi = scanner.nextLine();
			
			if (egitmenAdi.equals("exit")) {
				System.out.println("çıkış yapılıyor..");
				break;
			}
			
			System.out.println("Kurs adını giriniz: ");
			String kursAdi = scanner.nextLine();
			
			if (isExistInData(kursAdi, 0)) {
                System.out.println("Hata: Bu kurs adı zaten var!");
                continue;
            }
			
			System.out.println("kurs fiyatı: ");
			String kursFiyat = scanner.nextLine();
			
			try 
			{
				double fiyat = Double.parseDouble(kursFiyat);
				
				System.out.println("kategori adı: ");
				String kategoriAdi = scanner.nextLine();
				        
				
				if(fiyat>0) 
				{
					
					data[currentIndex][0] = egitmenAdi;
                    data[currentIndex][1] = kursFiyat;
                    data[currentIndex][2] = kategoriAdi;
                    data[currentIndex][3] = kursAdi;

                    currentIndex++;
                    
					for (Logger logger : loggers) 
					{
						logger.logEgitmen(egitmenAdi);
						logger.logKategori(kategoriAdi);
						logger.logKurs(kursAdi);
						logger.logKurs(fiyat);
					}
					
				}
				else
				{
					System.out.println("Hata: Kurs fiyatı 0 tlden küçük olamaz. loglama işlemi başarısız.");
				}
			} 
			catch (NumberFormatException e) {}
		}
		listData();
		productDao.add(product1);//db	
	}
	
    // Dizi içinde eşleşme kontrolü yapmak için metot
    private boolean isExistInData(String value, int column) {
        if (currentIndex == 0) {
            return false;
        }

        for (int i = 0; i < currentIndex; i++) {
            if (value.equalsIgnoreCase(data[i][column])) {
                return true;
            }
        }
        return false;
    }
    
    private void listData() {
        System.out.println("Girilen Veriler:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Veri #" + (i + 1));
            System.out.println("Eğitmen adı: " + data[i][0]);
            System.out.println("Kurs fiyatı: " + data[i][1]);
            System.out.println("Kategori adı: " + data[i][2]);
            System.out.println();
        }
    }

}