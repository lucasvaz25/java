package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double ConvertToReal(double price, double quant) {
		return (price * quant);
	}

	public static double PaidInReais(double quant) {
		return quant + (quant * IOF);
	}
}
