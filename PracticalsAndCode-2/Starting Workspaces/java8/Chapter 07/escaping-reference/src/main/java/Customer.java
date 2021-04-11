
public class Customer implements ReadOnlyCustomer {
	private String name;

	public String getName() {
		return name;
	}

	public Customer(Customer customer) {
		this.name = customer.getName();
	}

	public Customer(ReadOnlyCustomer customer) {
		this.name = customer.getName();
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;
	}


	public String toString() {
		return name;
	}
	
}
