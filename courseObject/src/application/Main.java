package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.Price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.Quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
	
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		product.RemoveProduct(quantity);

		System.out.println("Update data: " + product);
		sc.close();
	}

}