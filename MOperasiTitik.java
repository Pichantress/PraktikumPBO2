/**
 * File      : MOperasiTitik.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * 
*/

public class MOperasiTitik{
 public static void main(String[] args){
  Titik t1 = new Titik(4.0, 4.0);
  OperasiTitik o = new OperasiTitik();
  Titik t2 = o.refleksiX(t1);
  Titik t3 = o.refleksiY(t1);

  System.out.println("Titik : ("+t1.getAbsis() + ","+t1.getOrdinat()+")");
  System.out.println("Titik setelah refleksi sb X : ("+t2.getAbsis() + ","+t2.getOrdinat()+")");
  System.out.println("Titik setelah refleksi sb Y : ("+t3.getAbsis() + ","+t3.getOrdinat()+")");
  
 }
}