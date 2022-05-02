package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws IOException {

		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(s->System.out.println(s));
		
		String[] names= {"AI", "BG", "RT", "RES", "DEF"};
		Arrays.stream(names)
			.map(s->s.toLowerCase())
			.filter(x->x.startsWith("r"))
			.sorted()
			.forEach(s-> System.out.print(s+" "));
		
		Arrays.stream(new int[] {2,4,6,8,10})
			.map(x -> x*x)
			.average()
			.ifPresent(System.out::println);
		
		Stream<String> bands = 
				Files.lines(Paths.get("Files/bands.txt"));

		bands.sorted().filter(x->x.length() > 10).forEach(s->System.out.println(s));
		
		 bands = 
					Files.lines(Paths.get("Files/bands.txt"));
		 
		long rowCount =
			bands.sorted()
			 .map(x->x.split(","))
			 .filter(x->x.length==3)
			 .count();
		
		System.out.println("count="+rowCount);
		
		 bands = 
					Files.lines(Paths.get("Files/bands.txt"));
			bands.sorted()
			 .map(x->x.split(","))
			 .filter(x->x.length==3)
			 .forEach(x->System.out.println(" Index="+x[0]+" Name= "+x[1]+" Album="+x[2]));

		
	}

}
