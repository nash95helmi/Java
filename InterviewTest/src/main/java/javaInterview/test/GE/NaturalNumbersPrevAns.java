package javaInterview.test.GE;

import java.util.ArrayList;

public class NaturalNumbersPrevAns {

	public static void main(String[] args) {
		long startTime, endTime;
		startTime = System.nanoTime();
		first1500NaturalNum();
		endTime = System.nanoTime();
		System.out.println("Time taken second :: "+(endTime - startTime)/1000000000);
	}
	
	public static void first1500NaturalNum() {
		int index = 1;
		for(int i=2; index<=1500;i++) {
			ArrayList<Integer> remainder = new ArrayList<Integer>();
			int[] factorArr = {2,3,5};
			int number = i;
			
			while(number % factorArr[0] == 0 || number % factorArr[1] == 0 || number % factorArr[2] == 0) {
				for(int x = 0; x < factorArr.length; x++) {
					if(number % factorArr[x] == 0) {
						number = number / factorArr[x];
						remainder.add(factorArr[x]);
						break;
					}
				}
			}
			
			if(number != 1) {
				remainder.add(10);
			}
			
			if(!(i % 2 != 0 && i % 3 != 0 && i % 5 != 0) && !remainder.contains(10)) {
				System.out.println("No. " + index + " -> " + i + ":" + remainder);
				index++;
			}
			remainder = null;
		}
	}
}
