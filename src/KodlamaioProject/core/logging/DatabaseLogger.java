package KodlamaioProject.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void logKurs(double kursData) {
		System.out.println("kurs fiyatı veritabanına loglandı:" + kursData);		
	}

	@Override
	public void logEgitmen(String egitmenData) {
		System.out.println("eğitmen veritabanına loglandı:" + egitmenData);		
		
	}

	@Override
	public void logKategori(String kategoriData) {
		System.out.println("kategori veritabanına loglandı:" + kategoriData);		
		
	}

	@Override
	public void logKurs(String kursData) {
		System.out.println("kategori veritabanına loglandı:" + kursData);		
		
	}
	

}