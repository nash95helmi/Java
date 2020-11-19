package training.practice;

public class RoundUpDecimalNumber {
	public static void main(String[] args) {
		String input = "23.567987";
		RoundUpDecimal(input, 4);
	}
	
	private static void RoundUpDecimal(String input, int roundUp) {
		String[] inpArr = null;
		char[] inpInt = null;
		char[] inpInt1 = null;
		int count = 0;
		if(input != null) {
			inpArr = input.split("\\.");
			System.out.println(inpArr.length);
			for(String inp : inpArr) {
				count++;
				System.out.println("Input value :: "+inp);
				inpInt = count > 1 ? inp.toCharArray() : inpInt ;
				inpInt1 = count == 1 ? inp.toCharArray() : inpInt1 ;
			}
			if(inpInt != null && roundUp <= inpInt.length-1) {
				if(Integer.parseInt(String.valueOf(inpInt[roundUp])) > 5 && (roundUp - 1 >= 0)) {
					inpInt[roundUp - 1] = (char) (Integer.parseInt(String.valueOf(inpInt[roundUp] - 1)) + 1);
					for(int c=inpInt.length-1 ; c >= 0; c--) {
						if(c == roundUp - 1) {
							break;
						}else {
							inpInt[c] = ' ';
						}
					}
					inpInt[roundUp] = ' ';
					System.out.println(inpInt[roundUp - 1]);
				}
			}
			System.out.println(Float.parseFloat(String.valueOf(inpInt1) +"."+ String.valueOf(inpInt)));
		}
	}
}
