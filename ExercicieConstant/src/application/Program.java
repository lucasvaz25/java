package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar Price?");
		double p = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double q = sc.nextDouble();
		double t = CurrencyConverter.ConvertToReal(p, q);
		double tf = CurrencyConverter.PaidInReais(t);
		System.out.printf("Amount to be paid in reais = %.2f%n", tf);
		sc.close();
	}

}
