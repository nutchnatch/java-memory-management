import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		// This is a dangerous operation, CustomerRecords allows to do, breaking encapsulation
//		records.getCustomers().clear();

		// changing internal data structure / breaks encapsulation
//		records.find("John").setName("Simon");

		// does not have any effect on the origina data
		ReadOnlyCustomer c = records.find("John");
		Customer newCustomer = (Customer) c;
		newCustomer.setName("Simon");
				
		for (Customer next : records.getCustomers().values())
				{
					System.out.println(next);
				}

//		for(Customer next: records) {
//			System.out.println(next);
//		}

		//problem with the iterator.
		//Even with the iterator, we can remove items
//		Iterator<Customer> it = records.iterator();
//		it.next();
//		it.remove();


	}
	
}
