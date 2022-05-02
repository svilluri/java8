package func;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, String> getInt =
				(t) -> t*10+ " data multiplied by 10";
				
				
			System.out.println(getInt.apply(5));
	}

}
