package javaInterview.test.GE;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumbersSimplified {

	public static void main(String[] args) {
		int rem = 0, inp = 0;
		int value = 1, index = 1;
		int size = 1500;
		int i = 2;
		List<Integer> li = null;
		long startTime, endTime;

		startTime = System.nanoTime();
		mainMethod(rem, inp, value, size, index, i, li);
		endTime = System.nanoTime();
		
		System.out.println("Time taken second :: "+(endTime - startTime)/1000000000);
	}
	
	
	private static void mainMethod(int rem, int inp, int value, int size, int index, int i, List<Integer> li) {
		while(index <= size) {
			li = new ArrayList<Integer>();
			if(i % 2 == 0 || i % 3 == 0  || i % 5 == 0) {
				
				inp = i;
				getNaturalNumber(2, i, inp, rem, li);	//factor 2
				getNaturalNumber(3, i, inp, rem, li);	//factor 3
				getNaturalNumber(5, i, inp, rem, li);	//factor 5
				
				for(Integer val : li) {
					value *= val;
				}
				if(value == i) {
					System.out.println("["+index+"] "+i+" :"+loopList(li));
					index++;
				}
				inp = 0;
				rem = 0;
				value = 1;
				li = null;
				i++;
			}else {
				i++;
			}
		}
	}

	
	private static void getNaturalNumber(int factor, int num, int inp, int rem, List<Integer> li) {
		while(num % factor == 0) {
			inp = inp / factor;
			rem = inp % factor;
			li.add(factor);
			if(inp == 1 || rem > 0) {
				rem = 0;
				break;
			}
		}
	}

	
	private static String loopList(List<Integer> li) {
		String result = "";
		for(int c = 0; c < li.size(); c++) {
			result += " "+li.get(c);
		}
		return result;
	}
}
