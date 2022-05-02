package async;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandleExample {

	public static void main(String[] args) {

		boolean error = false;
		CompletableFuture<String> future =
				CompletableFuture.supplyAsync ( 
						() -> {
							if ( error ) 
								throw new RuntimeException("errorExceptionally@future");
							return "success";
						}
				).exceptionally((e) -> {
						System.out.println(e.getMessage());
						return null;
				});
		System.out.println(future.join());
	}

}
