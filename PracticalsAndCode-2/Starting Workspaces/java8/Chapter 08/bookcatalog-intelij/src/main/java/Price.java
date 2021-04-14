
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Price is now an immutable class, because it is not changeable from outside.
 * So, it is safe to return an instance of it.
 */
public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") * rates.get(toCurrency);
			//The problem here is that we are overriding the value property, we should not
			//We should only return the calculated value.
			//value = conversion * value;
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	public Map<String,Double> getRates() {
		//Should return an immutable collection
		//return rates;
		return Collections.unmodifiableMap(rates);
	}
	
}
