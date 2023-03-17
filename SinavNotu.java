package hellojava;

public class SinavNotu {
	private int ogrenciNo;
	private String adi;
	private String soyadi;
	private double arasinavnotu;
	private double yariyilsinavnotu;
	private double sınavnotu;

	public SinavNotu(int ogrenciNo, String adi, String soyadi, double araSinavNotu, double yariyilSinavNotu) {
	this.ogrenciNo = ogrenciNo;
	this.adi = adi;
	this.soyadi = soyadi;
	this.arasinavnotu = araSinavNotu;
	this.yariyilsinavnotu = yariyilSinavNotu;
	}

	public void notHesapla() {
	this.sınavnotu = ((this.arasinavnotu * 0.3) + (this.yariyilsinavnotu * 0.7));
	}

	public int getOgrenciNo() {
	return this.ogrenciNo;
	}

	public String getAdi() {
	return this.adi;
	}

	public String getSoyadi() {
	return this.soyadi;
	}

	public double getAraSinavNotu() {
	return this.arasinavnotu;
	}

	public double getYariyilSinavNotu() {
	return this.yariyilsinavnotu;
	}

	public double getSinavNotu() {
	return this.sınavnotu;
	}

	public static void main(String[] args) {
	SinavNotu[] sinavlar = {
	new SinavNotu(1, "berke", "çağlar", 70, 80),
	new SinavNotu(2, "berke", "çağlar", 70, 80),
	new SinavNotu(3, "berke", "çağlar", 70, 80),
	new SinavNotu(4, "berke", "çağlar", 70, 80),
	new SinavNotu(5, "berke", "çağlar", 70, 80),
	new SinavNotu(6, "berke", "çağlar", 70, 80),
	new SinavNotu(7, "berke", "çağlar", 70, 80),
	new SinavNotu(8, "berke", "çağlar", 70, 80),
	new SinavNotu(9, "berke", "çağlar", 70, 80),
	new SinavNotu(10, "berke", "çağlar", 70, 80)
	};

	
	
	for (SinavNotu sinav : sinavlar) {
	  sinav.notHesapla();
	}

	double toplamNot = 0;
	for (SinavNotu sinav : sinavlar) {
	  toplamNot += sinav.getSinavNotu();
	  System.out.println(sinav.getAdi() + " " + sinav.getSoyadi() + ": " + sinav.getSinavNotu());
	}

	double ortalamaNot = toplamNot / sinavlar.length;
	System.out.println("Sınıf Ortalaması: " + ortalamaNot);
	}

	}

