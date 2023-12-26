package KodlamaioProject.entities;
import java.util.Scanner;

public class Product {
	
	public String egitmen;
	private String kurs;
	private String kategori;
	private double kursFiyat;
	
	Scanner input = new Scanner(System.in);
	
	public Product() {
		this.egitmen = egitmen;
		this.kategori = kategori;
		this.kursFiyat = kursFiyat;
		this.kurs = kurs;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

	public String getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public double getKursFiyat() {
		return kursFiyat;
	}

	public void setKursFiyat(double kursFiyat) {
		this.kursFiyat = kursFiyat;
	}


	

}