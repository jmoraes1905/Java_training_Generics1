package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	//This considers a class to be a generic type
	//Allows reuse and guarantees type security - unlike Object list
	//Types are defined when a class' object is instantiated
	
	private List<T> list = new ArrayList<>();
	//The list and the role class is parameterized with the T generic type
	
	public PrintService() {
		
	}
	public void addValue(T value) {
		list.add(value);
		
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("The list is empty!");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i=1;i<list.size();i++) {
			System.out.print(", "+list.get(i));
		}
		System.out.println("]");
	}
}
