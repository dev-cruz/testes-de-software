package entrega_introducao;

public class Converter {
	public double convertToDollar(double value, String currency) throws Exception {
		double convertedDollar;
		
		switch(currency) {
		case "BRL":
			convertedDollar = value * 0.19;
			break;
			
		case "EUR":
			convertedDollar = value * 1.18;
			break;
			
		case "JPY":
			convertedDollar = value * 0.0094;
			break;
			
		default: 
			throw new Exception("Currency not available");		
		}
		
		return Math.round(convertedDollar * 10.0) / 10.0;
	}
}
