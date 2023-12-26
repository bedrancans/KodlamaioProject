package KodlamaioProject.core.logging;

public class FileLogger implements Logger {

	@Override
	public void logKurs(double kursData) {
		System.out.println("kurs fiyatı dosyaya loglandı:" + kursData);
		
	}

	@Override
	public void logEgitmen(String egitmenData) {
		System.out.println("eğitmen dosyaya loglandı:" + egitmenData);
		
	}

	@Override
	public void logKategori(String kategoriData) {
		System.out.println("kategori dosyaya loglandı:" + kategoriData);
		
	}

	@Override
	public void logKurs(String kursData) {
		System.out.println("kategori dosyaya loglandı:" + kursData);
		
	}

}