/**
 * File      : OperasiTitik.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : Kelas yang berisi objek OperasiTitik
 * 
*/

public class OperasiTitik{ 
 private static void refleksiSumbuX(Titik titik){
  titik.setOrdinat(-titik.getOrdinat());
 }

 private static void refleksiSumbuY(Titik titik){
  titik.setAbsis(-titik.getAbsis());
 }

 public static Titik refleksiX(Titik t){
  Titik hasil = new Titik(t.getAbsis(), -t.getOrdinat());
  return hasil;
 }

 public static Titik refleksiY(Titik t){
  Titik hasil = new Titik(-t.getAbsis(), t.getOrdinat());
  return hasil;
 }
}