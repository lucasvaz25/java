package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double RealSalary;

	public double NetSalary() {
		return RealSalary = GrossSalary - Tax;
	}

	public double IncreaseSalary(double percentage) {
		return RealSalary = NetSalary() + ((GrossSalary / 100) * percentage);
	}

	public String toString() {
		return Name + ", $ " + String.format("%.2f", RealSalary);
	}
}
