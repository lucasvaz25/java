package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle Width and Height: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();

		rectangle.Area();
		rectangle.Perimeter();
		rectangle.Diagonal();

		System.out.println(rectangle);

		sc.close();

	}

}
