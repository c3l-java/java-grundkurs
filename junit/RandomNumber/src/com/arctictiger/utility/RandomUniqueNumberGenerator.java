package com.arctictiger.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUniqueNumberGenerator {
	List<Integer> numbers;
	Random generator;

	public RandomUniqueNumberGenerator(int seed, int values) {
		numbers = new ArrayList<Integer>();
		for (int i = 0; i < values; i++) {
			numbers.add(i);
		}
		generator = new Random(seed);
	}


	public int getNext() {
		int index = (int) Math.floor(generator.nextDouble() * numbers.size());
		Integer result = numbers.remove(index);
		return result;
	}
	
	public boolean hasNext(){
		return numbers.size() > 0;
	}


}
