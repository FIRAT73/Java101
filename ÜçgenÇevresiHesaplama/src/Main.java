import java.util.Scanner;

/*---------------1.uygulama----------------------
 * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
 */

/*---------------2.uygulama-----------------------
 * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
 * ==>Formül
 * ==>Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * ==>𝑢 = (a+b+c) / 2
 * ==>Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		/*-------------------1.uygulama-------------------------------------
		int a,b;
		double c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.Kenar degeri: ");
		a = input.nextInt();

		System.out.println("2.Kenar degeri: ");
		b = input.nextInt();

		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs değeri: " + c);
		
		*/
		
		//---------------------2.uygulama-------------------------------------
		int a,b,c;
		double u,alan;
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("1.Kenar degeri: ");
		a = girdi.nextInt();
		
		System.out.print("2.Kenar degeri: ");
		b = girdi.nextInt();
		
		System.out.print("3.Kenar degeri: ");
		c = girdi.nextInt();
		
		u = (a+b+c)/2;
		System.out.println("Üçgenin Çevresi: "+2*u);
		
		alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenin alanı: "+ alan);

		
	}

}
