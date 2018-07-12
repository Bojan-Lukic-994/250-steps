package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StrLengthComparator implements Comparator<String> {
	@Override
	public int compare(String value2, String value1) {
		return Integer.compare(value1.length(), value2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>(new StrLengthComparator());
		queue.addAll(List.of("Apple", "Pear", "Orange"));

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
