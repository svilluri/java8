package func;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String args[]) {
		Predicate<String> checkLength =
			str->str.length()>5;
			
		System.out.println("checkLength="+checkLength.test("fssdfsdf"));
		System.out.println("checkLength="+checkLength.test("abc"));
	}
}
