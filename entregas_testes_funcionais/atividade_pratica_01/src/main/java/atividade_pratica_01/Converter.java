package atividade_pratica_01;

import java.util.Map;

public class Converter {
	public double convertToDollar(double value, String currency) throws Exception {
		if (value < 0 || value > Double.MAX_VALUE) throw new Exception("Value out of range");

		double convertedDollar;
		Map<String, Double> currencyMultiplier = Map.of("BRL", 0.19, "EUR", 1.18, "JPY", 0.0094);
		
		if (currencyMultiplier.containsKey(currency)) {
			Double multiplier = currencyMultiplier.get(currency);
			convertedDollar = value * multiplier;
			return Math.round(convertedDollar * 10.0) / 10.0;
		} else {
			throw new Exception("Currency not available");
		}
	}
}
