package entities;

public class Product {

	public String name;
	public double Price;
	public int Quantity;

	public double totalValueInStock() {
		return Price * Quantity;
	}

	public void AddProducts(int quantity) {
		this.Quantity += quantity;
	}

	public void RemoveProduct(int quantity) {
		this.Quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", Price) + ", " + Quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock()) ;
	}
}
