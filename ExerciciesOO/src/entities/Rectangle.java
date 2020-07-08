package entities;

public class Rectangle {
	public double Width;
	public double Height;

	public double Area() {
		return Width * Height;
	}

	public double Perimeter() {
		return (2 * (Width + Height));
	}

	public double Diagonal() {
		return Math.sqrt((Math.pow(Width, 2)) + (Math.pow(Height, 2)));
	}

	public String toString() {
		return "Area = " + String.format("%.2f", Area()) + " Perimeter = " + String.format("%.2f", Perimeter())
				+ " Diagonal = " + String.format("%.2f", Diagonal());
	}

}
