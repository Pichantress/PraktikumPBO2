/**
 * File      : Titik.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : Kelas yang berisi objek Titik
 * 
*/

public class Titik{
	// Atribut
	private Double absis;
	private Double ordinat;
	private static int counterTitik = 0;

	// Konstruktor
	public Titik(){
		absis = 0.0;
		ordinat = 0.0;
		counterTitik ++;
	}
	
	// Overload konstruktor
	public Titik(Double a, Double o){
		this.absis = a;
		this.ordinat = o;
		counterTitik ++;
	}
	
	// Setter	
	public void setAbsis(Double a){
		this.absis = a;
	}

	public void setOrdinat(Double o){
		this.ordinat = o;
	}
	
	// Getter	
	public Double getAbsis() {
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}