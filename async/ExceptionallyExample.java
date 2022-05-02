package async;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyExample {

	public static void main(String[] args) {

		boolean error = true;
		CompletableFuture<String> future =
				CompletableFuture.supplyAsync ( 
						() -> {
							if ( error ) 
								throw new RuntimeException("errorhandle@future");
							return "success";
						}
				).handle((s,e) -> {
					if ( e != null ) {
						System.out.println(e.getMessage());
						return null;
					}
					
					return s;
				});
		System.out.println(future.join());
	}

}
