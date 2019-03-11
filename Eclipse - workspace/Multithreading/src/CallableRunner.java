import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return " Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		Future<String> weclomeFuture = executorService.submit(new CallableTask("in28Minutes"));

		System.out.println("\n new CallableTask(\"in28Minutes\") executed");

		String welcomeMessage = weclomeFuture.get();

		System.out.println(welcomeMessage);

		System.out.println("\n Main completed");

	}

}
