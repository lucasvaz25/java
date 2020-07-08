package entities;

import entities.Client;

public class Account {
	private int number;
	private Client client;
	private double valueDep;
	private double valueDraw;
	private double valueInAccount;
	public static final double TX = 5.00;

	public double getValueDraw() {
		return valueDraw;
	}

	public void setValueDraw(double valueDraw) {
		this.valueDraw = valueDraw;
	}

	public double getValueDep() {
		return valueDep;
	}

	public void setValueDep(double valueDep) {
		this.valueDep = valueDep;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Account() {
		this.client = new Client();
	}

	public double addValue(double valuedep) {
		return this.valueInAccount += valuedep;
	}

	public double remValue(double valuedraw) {
		return this.valueInAccount -= (valuedraw + TX);
	}

	public double TotalInAccount() {
		return this.valueInAccount;
	}

	public void showdata() {
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", this.getNumber(), this.getClient().getName(),
				this.TotalInAccount());
	}
}
