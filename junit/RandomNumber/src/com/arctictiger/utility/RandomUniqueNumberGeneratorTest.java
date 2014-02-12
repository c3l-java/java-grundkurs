package com.arctictiger.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUniqueNumberGeneratorTest {

	@Test
	public void canCreateCorrectSequence() {
		int[] expected = {0,1,2,3,4,5,6,7,8,9};
		int[] actual = new int[10];
		RandomUniqueNumberGenerator numGen = new RandomUniqueNumberGenerator(0, 10);
		while(numGen.hasNext()){
			int tempNum = numGen.getNext();
			actual[tempNum] = tempNum;
		}
		assertArrayEquals(expected, actual);
	}

	@Test
	public void canCreateRandomSequence(){
		boolean passed = false;
		RandomUniqueNumberGenerator numGen = new RandomUniqueNumberGenerator(0, 10);
		for(int i =0; i < 10; i ++){
			if(i != numGen.getNext()){
				passed = true;
				break;
			}
		}
		assertTrue(passed);
	}
	
	@Test
	public void canCreateSameSequenceWithSeed(){
		RandomUniqueNumberGenerator numGen = new RandomUniqueNumberGenerator(5, 100);
		RandomUniqueNumberGenerator numGen2 = new RandomUniqueNumberGenerator(5, 100);
		while(numGen.hasNext()){
			if(numGen.getNext() != numGen2.getNext()){
				fail("Seeded generator produced different number for the same seed");
			}
		}
		assertTrue(true);
	}
	
	@Test
	public void canCreateDifferentSequences(){
		RandomUniqueNumberGenerator numGen = new RandomUniqueNumberGenerator(16, 100);
		RandomUniqueNumberGenerator numGen2 = new RandomUniqueNumberGenerator(5, 100);
		boolean differentNumbers = false;
		while(numGen.hasNext()){
			if(numGen.getNext() != numGen2.getNext()){
				differentNumbers = true;
				break;
			}
		}
		assertTrue(differentNumbers);
	}
	
}
