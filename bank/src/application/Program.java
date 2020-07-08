package application;

import entities.Account;
import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account = new Account();
		Client client = new Client();
		double valuedep;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		client.setName(name);
		account.setClient(client);
		account.setNumber(number);
		System.out.print("Is ther na initial deposit (y/n)? ");
		char x = sc.next().charAt(0);
		if (x == 'y') {
			System.out.print("Enter Initial deposit value: ");
			valuedep = sc.nextDouble();
			account.addValue(valuedep);
		} else {

		}

		System.out.println();
		System.out.println("Account data:");
		account.showdata();
		System.out.println();
		System.out.print("Enter a deposit value: ");
		valuedep = sc.nextDouble();
		account.addValue(valuedep);
		System.out.println("Update account data: ");
		account.showdata();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valuedep = sc.nextDouble();
		account.remValue(valuedep);
		System.out.print("Update account data: ");
		account.showdata();

		sc.close();
	}

}
