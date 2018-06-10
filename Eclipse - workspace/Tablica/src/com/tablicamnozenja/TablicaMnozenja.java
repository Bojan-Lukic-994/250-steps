package com.tablicamnozenja;

public class TablicaMnozenja {

	void print() {
		print(8);
	}

	void print(int table) {
		print(table, 1, 10);
	}

	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}

	}

}
