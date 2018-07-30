import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		// list of tasks
		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"), new CallableTask("Skabo"),
				new CallableTask("Bubbles"));

		// result = any of listed tasks
		String finalResult = executorService.invokeAny(tasks);

		// prints the result
		System.out.println(finalResult);

		executorService.shutdown();
	}

}
