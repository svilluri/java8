package func;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String args[]) {
		Supplier<Double> getRandomDouble =
				() -> Math.random();
		System.out.println(getRandomDouble.get());
	}
}