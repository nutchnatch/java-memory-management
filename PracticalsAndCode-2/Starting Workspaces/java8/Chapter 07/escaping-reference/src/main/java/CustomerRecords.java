import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
//	public Map<String, Customer> getCustomers() {
//		return this.records;
//	}

//	public Map<String, Customer> getCustomers() {
//		return new HashMap<String, Customer>(this.records);
//	}

	public Map<String, Customer> getCustomers() {
		return Collections.unmodifiableMap(this.records);
	}

	// again, we are escaping a reference and allows other to change my collection
//	public Customer find(String name) {
//		return records.get(name);
//	}
//	public Customer find(String name) {
//		return new Customer(this.records.get(name));
//	}

	public ReadOnlyCustomer find(String name) {
		return new Customer(this.records.get(name));
	}

	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
}
