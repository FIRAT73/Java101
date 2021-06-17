import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Matematik notunuz : ");
		mat = scn.nextInt();
	
		
		System.out.println("fizik notunuz : ");
		fizik = scn.nextInt();
		
		System.out.println("kimya notunuz : ");
		kimya = scn.nextInt();
		
		System.out.println("turkce notunuz : ");
		turkce = scn.nextInt();
		
		System.out.println("tarih notunuz : ");
		tarih = scn.nextInt();
		
		System.out.println("muzik notunuz : ");
		muzik = scn.nextInt();

		
		int toplam = (mat + fizik + kimya + turkce + tarih +muzik);
		int sonuc = toplam / 6;
		System.out.println("Ortalamanýz: " + sonuc);
		
		if (sonuc>=60) {
			System.out.println("Geçtin");
		}else {

			System.out.println("Kaldýn");
		}
	}

}
