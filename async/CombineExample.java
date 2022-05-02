package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CombineExample {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		CompletableFuture<String> future =
				getUserEmail().thenCombine(getWeatherReport(), (e,w) -> {
					System.out.println("Sending email to "+e+" with report - "+w);
					delay(1);
					return e+w;
				}
				);
		
		System.out.println("Doing Something");
		delay(4);
		System.out.println("Calling future.join() " + future.join());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: "+ ( endTime - startTime )/1000 );
	}

	public static void delay( int seconds ) {
		try {
			System.out.println("Delay :" +seconds+" Seconds");
			TimeUnit.SECONDS.sleep(seconds);
		}
		catch ( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	public static CompletableFuture<String> getUserEmail() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getUserEmail() "+ Thread.currentThread().getName());
			delay(2);
			
			return "test@test.com";
		});
	}
	
	public static CompletableFuture<String> getWeatherReport() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getWeatherReport() "+ Thread.currentThread().getName());
			delay(3);
			
			return "Weather Report of the city is Shine";
		});
	}
}
