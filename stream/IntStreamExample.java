package stream;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {

		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 10).skip(6).forEach(System.out::print);
		System.out.println();
		System.out.println(
			IntStream.range(1, 10).sum() );
	}

}
