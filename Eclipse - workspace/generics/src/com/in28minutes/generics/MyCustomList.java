package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<TYPE extends Number> {

	ArrayList<TYPE> list = new ArrayList<>();

	public void addElement(TYPE element) {
		list.add(element);
	}

	public void removeElement(TYPE element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public TYPE get(int index) {
		return list.get(index);
	}

}
