import java.util.Scanner;

/*-----1.Uygulama-------------------
 *Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp 
 *ekrana bastıran programı yazın.
 *		(Not : KDV tutarını 18% olarak alın)
 *		KDV'siz Fiyat = 10;
 *		KDV'li Fiyat = 11.8;
 *		KDV tutarı = 1.8; 
 *
 *
 */

/*----2.Uygulama---------------------
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 
 * olarak KDV tutarı hesaplayan programı yazınız.
 */

public class Main {

	public static void main(String[] args) {
		
		/*-----------------------1.uygulama-------------------------------------
		 
		double fiyat,kdvOran = 0.18;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("KDV'siz Fiyatı giriniz: ");
		fiyat = girdi.nextDouble();
		
		double kdvTutar = fiyat * kdvOran;
		System.out.println("Kdv Oranı: " + kdvTutar);
		
		double kdvFiyat = fiyat + kdvTutar;
		System.out.println("Kdv'li Fiyat: "+kdvFiyat);
		
		*/
		
		//------------------------2.Uygulama--------------------------------------
		double fiyat,kdvTutar,kdvFiyat;
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("KDV'siz fiyatı giriniz: ");
		fiyat = girdi.nextDouble();
		
		if(fiyat>0 & fiyat<=1000) {
			double kdvOranı=0.18;
			
			kdvTutar= fiyat*kdvOranı;
			System.out.println("Kdv oranı: "+ kdvTutar);
			
			kdvFiyat=fiyat+kdvTutar;
			System.out.println("Kdv'li fiyat: "+kdvFiyat);
			
		}else {
			double kdvOranı=0.08;
			
			kdvTutar= fiyat*kdvOranı;
			System.out.println("Kdv oranı: "+ kdvTutar);
			
			kdvFiyat=fiyat+kdvTutar;
			System.out.println("Kdv'li fiyat: "+kdvFiyat);
		}
		
		
		
		
	}

}
