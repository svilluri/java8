package func;

import java.util.function.Consumer;

class Person {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}
public class ConsumerExample {

	public static void main(String args[]) {
		
		Person person =
				new Person();
		
		Consumer<Person> setName = t -> 
			t.setName("Updated Name");
			
		setName.accept(person);
		
		System.out.println(person.getName());
	}
}
