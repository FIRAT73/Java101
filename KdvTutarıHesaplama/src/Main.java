import java.util.Scanner;

/*-----1.Uygulama-------------------
 *Java ile kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� ve KDV tutar�n� hesaplay�p 
 *ekrana bast�ran program� yaz�n.
 *		(Not : KDV tutar�n� 18% olarak al�n)
 *		KDV'siz Fiyat = 10;
 *		KDV'li Fiyat = 11.8;
 *		KDV tutar� = 1.8; 
 *
 *
 */

/*----2.Uygulama---------------------
 * E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den b�y�k ise KDV oran�n� %8 
 * olarak KDV tutar� hesaplayan program� yaz�n�z.
 */

public class Main {

	public static void main(String[] args) {
		
		/*-----------------------1.uygulama-------------------------------------
		 
		double fiyat,kdvOran = 0.18;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("KDV'siz Fiyat� giriniz: ");
		fiyat = girdi.nextDouble();
		
		double kdvTutar = fiyat * kdvOran;
		System.out.println("Kdv Oran�: " + kdvTutar);
		
		double kdvFiyat = fiyat + kdvTutar;
		System.out.println("Kdv'li Fiyat: "+kdvFiyat);
		
		*/
		
		//------------------------2.Uygulama--------------------------------------
		double fiyat,kdvTutar,kdvFiyat;
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("KDV'siz fiyat� giriniz: ");
		fiyat = girdi.nextDouble();
		
		if(fiyat>0 & fiyat<=1000) {
			double kdvOran�=0.18;
			
			kdvTutar= fiyat*kdvOran�;
			System.out.println("Kdv oran�: "+ kdvTutar);
			
			kdvFiyat=fiyat+kdvTutar;
			System.out.println("Kdv'li fiyat: "+kdvFiyat);
			
		}else {
			double kdvOran�=0.08;
			
			kdvTutar= fiyat*kdvOran�;
			System.out.println("Kdv oran�: "+ kdvTutar);
			
			kdvFiyat=fiyat+kdvTutar;
			System.out.println("Kdv'li fiyat: "+kdvFiyat);
		}
		
		
		
		
	}

}
