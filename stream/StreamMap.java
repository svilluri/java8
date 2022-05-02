	package stream;

import java.util.List;

import common.Customer;
import database.SampleDatabase;

public class StreamMap {

	public static void main(String[] args) {
		List<Customer> customers = SampleDatabase.getCustomers();
	}

}
