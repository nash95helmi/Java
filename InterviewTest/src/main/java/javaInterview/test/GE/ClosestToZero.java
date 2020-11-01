package javaInterview.test.GE;

import java.util.ArrayList;
import java.util.List;

public class ClosestToZero {

	public static void main(String[] args) {
		int[] inp = {11,0,-9,23,34,-11,-3,23,-9};
		int minNeg = getNegative(inp);
		int minPos = getPositive(inp);
		int res = minNeg < minPos ? minNeg*-1 : minPos;
		
		System.out.println("Closest to 0 :: "+res);
	}

	private static int getNegative(int[] inp) {
		int minVal = -999999999;
		for(int i=0;i<inp.length;i++) {
			if(inp[i] < 0) {
				minVal = inp[i] > minVal ? inp[i] : minVal;
			}
		}
		System.out.println("- val :: "+minVal);
		return minVal * -1;
	}

	private static int getPositive(int[] inp) {
		int minVal = 999999999;
		for(int i=0;i<inp.length;i++) {
			if(inp[i] > 0) {
				minVal = inp[i] < minVal ? inp[i] : minVal;
			}
		}
		System.out.println("+ val :: "+minVal);
		return minVal;
	}

}
