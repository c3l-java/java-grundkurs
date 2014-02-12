package com.arctictiger.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUniqueNumberGeneratorSpeedTest {

	@Test
	public void canGenerate100000NumbersIn500ms() {
		RandomUniqueNumberGenerator numGen = new RandomUniqueNumberGenerator(10, 100000);
		long startTime = System.currentTimeMillis();
		while(numGen.hasNext()){
			numGen.getNext();
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		
		numGen = new RandomUniqueNumberGenerator(10, 100000);
		startTime = System.currentTimeMillis();
		while(numGen.hasNext()){
			numGen.getNext();
		}
		endTime = System.currentTimeMillis();
		long duration2 = endTime - startTime;
		long avgDuration = (duration + duration2) / 2;
		assertTrue("Expected less than 500ms, but it was " + avgDuration + "ms", avgDuration < 500);
		
	}

}
