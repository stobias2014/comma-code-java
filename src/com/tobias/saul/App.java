package com.tobias.saul;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static int counter = 0;

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		
		String s = App.listToStringSepratedByAndConverter(numbers);
		System.out.println(s);

	}
	
	public static String listToStringSepratedByAndConverter(List<Integer> items) {
		
		StringBuilder sb = new StringBuilder();
		
		int size = items.size();
		
		items.forEach((item) -> {
			counter++;
			if(!(counter == size)) {
				sb.append(item + " and ");
			} else {
				sb.append(item);
			}
			
		});
		
		return sb.toString();
	}

}
