import java.util.Scanner;

/*
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sýnav puanlarýný kullanýcýdan alan 
 * ve ortalamalarýný hesaplayýp ekrana bastýrýlan programý yazýn. Ayný program içerisinde koþullu ifadeler 
 * kullanýlarak, eðer kullanýcýnýn ortalamasý 60'dan büyük ise ekrana "Sýnýfý Geçti" , küçük ise "Sýnýfta Kaldý" yazsýn. 
 * 					Not : If ve Else kullanýlmayacak...
 * */
public class main {

	public static void main(String[] args) {
		
		int mat,fiz,kim,tür,tar,müz;
		
		Scanner girdi=new Scanner(System.in);
		
		System.out.println("Matematik notunuz: ");
		mat = girdi.nextInt();
		
		System.out.println("Fizik notunuz: ");
		fiz = girdi.nextInt();
		
		System.out.println("Kimya notunuz: ");
		kim = girdi.nextInt();
		
		System.out.println("Türkçe notunuz: ");
		tür = girdi.nextInt();
		
		System.out.println("Tarih notunuz: ");
		tar = girdi.nextInt();
		
		System.out.println("Müzik notunuz: ");
		müz = girdi.nextInt();
		
		int toplam = (mat+fiz+kim+tür+tar+müz);
		double sonuc = toplam / 6.0;
		
		while(sonuc>=60) {
			System.out.println("Sýnýfý geçtin");
			return;
		}
		while(sonuc<60) {
			System.out.println("Sýnýfta kaldýn");
			return;
		}
		
		

	}

}
