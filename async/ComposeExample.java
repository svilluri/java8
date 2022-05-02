package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ComposeExample {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		CompletableFuture<String> future =
				getUserDetails().thenCompose(s-> getWishList(s));
		
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
	
	public static CompletableFuture<String> getUserDetails() {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getUserDetails() "+ Thread.currentThread().getName());
			delay(2);
			
			return "UserDetails";
		});
	}
	
	public static CompletableFuture<String> getWishList(String user) {
		return CompletableFuture.supplyAsync(() -> {
			System.out.println("getWishList() "+ Thread.currentThread().getName());
			delay(3);
			
			return "User's WishList";
		});
	}
}
