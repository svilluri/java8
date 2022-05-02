package database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import common.Customer;

public class SampleDatabase {
	
	public static List<Customer> getCustomers() {
		
		ArrayList<Customer> customerList =
				new ArrayList<Customer>();
				
		customerList.add(new Customer(101, "John", "Last1", Arrays.asList("1111111111", "1111111112")));
		customerList.add(new Customer(101, "Smith", "Last2", Arrays.asList("2111111111", "2111111112")));
		customerList.add(new Customer(101, "Peter", "Last3", Arrays.asList("3111111111", "3111111112")));
		
//		customerList.addAll(Arrays.asList(
//				new Customer(101, "John", "Last1", Arrays.asList("1111111111", "1111111112")),
//				new Customer(101, "Smith", "Last2", Arrays.asList("2111111111", "2111111112")),
//				new Customer(101, "Peter", "Last3", Arrays.asList("3111111111", "3111111112")))
//							);
		return customerList;		
	}
}
