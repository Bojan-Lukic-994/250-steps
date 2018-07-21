package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class SOConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class NumSquareMappper implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class LambdaBehindTheScreenRunner {

	public static void main(String[] args) {

		// storing functions in variabes - example
		Predicate<? super Integer> EvenPredicate = createEvenPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

		List.of(23, 43, 20, 88).stream().filter(EvenPredicate)
				.map(n -> n * n)
				.forEach(e -> System.out.println(e));

		List.of(23, 43, 20, 88).stream().filter(new EvenNumberPredicate()).map(new NumSquareMappper())
				.forEach(new SOConsumer());

		// .filter(new EvenNumberPredicate())
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

		// .map(n -> n * n)
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);

		// .forEach(e -> System.out.println(e));
		// Consumer<? superT> action
		// void accept(T t);
	}

	// returnng functions from methods - example
	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

}
