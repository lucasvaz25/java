import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		double area, pi, x;
		int a;

//		pi = 3.14159;
		System.out.println("Entrada:");
		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		dif = a * b - c * d;
//   	x = pi * (Math.pow(area, 2));

		if ((a %= 2) == 0) {
			System.out.println("Saida = ");
			System.out.println(" PAR ");
		} else {
			System.out.println("Saida = ");
			System.out.println(" IMPAR ");
		}
		sc.close();

	}

}
