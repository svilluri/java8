package common;

import java.util.List;

public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private List<String> phoneNumList;
	
	public Customer(Integer id, String firstName, String lastName, List<String> phoneNumList) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumList = phoneNumList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getPhoneNumList() {
		return phoneNumList;
	}
	public void setPhoneNumList(List<String> phoneNumList) {
		this.phoneNumList = phoneNumList;
	}
	
	
}
