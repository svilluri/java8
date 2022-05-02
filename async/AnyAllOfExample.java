package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AnyAllOfExample {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		CompletableFuture<Void> future =
				CompletableFuture.allOf(future1(), future2(), future3());
		
		System.out.println("Doing Something");
		delay(4);
		System.out.println("Calling future.join() " + future.join());
		long endTime = System.currentTimeMillis();
		System.out.println("time taken: "+ ( endTime - startTime )/1000 );
		
		startTime = System.currentTimeMillis();
		CompletableFuture<Object> futureR =
				CompletableFuture.anyOf(future1(), future2(), future3());
		
		System.out.println("Doing Something");
		delay(4);
		System.out.println("Calling future.join() " + futureR.join());
		endTime = System.currentTimeMillis();
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
	
	public static CompletableFuture<String> future1() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("future1() "+ Thread.currentThread().getName());
			delay(2);
			
			return "1";
		});
	}
	
	public static CompletableFuture<String> future2() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("future2() "+ Thread.currentThread().getName());
			delay(4);
			
			return "2";
		});
	}
	
	
	public static CompletableFuture<String> future3() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("future3() "+ Thread.currentThread().getName());
			delay(1);
			
			return "3";
		});
	}	
}
