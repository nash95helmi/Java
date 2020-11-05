package javaInterview.test.GE;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumbers {

	public static void main(String[] args) {
		int rem = 0;
		int inp = 0;
		int value = 1;
		int size = 1500;
		int index = 1;
		int i = 2;
		List<Integer> li = null;
		
		while(index <= size) {
			li = new ArrayList<Integer>();
			if(i % 2 == 0 || i % 3 == 0  || i % 5 == 0) {
				inp = i;
				
				//factor 2
				while(i % 2 == 0) {
					inp = inp / 2;
					rem = inp % 2;
					li.add(2);
					if(inp == 1 || rem > 0) {
						rem = 0;
						break;
					}
				}
				
				//factor 3
				while(i % 3 == 0) {
					inp = inp / 3;
					rem = inp % 3;
					li.add(3);
					if(inp == 1 || rem > 0) {
						rem = 0;
						break;
					}
				}
				
				//factor 5
				while(i % 5 == 0) {
					inp = inp / 5;
					rem = inp % 5;
					li.add(5);
					if(inp == 1 || rem > 0) {
						rem = 0;
						break;
					}
				}
				
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
	
	private static String loopList(List<Integer> li) {
		String result = "";
		for(int c = 0; c < li.size(); c++) {
			result += " "+li.get(c);
		}
		return result;
	}

}
