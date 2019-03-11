import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// list of tasks
		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"), new CallableTask("Skabo"),
				new CallableTask("Bubbles"));

		List<Future<String>> finalResults = executorService.invokeAll(tasks);

		// prints all tasks
		for (Future<String> result : finalResults) {
			System.out.println(result);
		}

		executorService.shutdown();
	}

}
