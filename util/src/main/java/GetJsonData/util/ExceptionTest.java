package GetJsonData.util;

public class ExceptionTest {
	
	private static boolean isSent = true;
	
	public static void main(String[] args) {
		String input = "123131";
		
		if(submitMyhixDischargeSummaryProcess(input)) {
			if(isSent) {
				System.out.println("Successfully sent");
			}else {
				System.out.println("Failed sent");
			}
			
		}
		
	}

	private static boolean submitMyhixDischargeSummaryProcess(String input) {
		try {
			if (!connectToRepository(input)) {
				System.out.println("False");
				return false;
			}
			System.out.println("Sending Util :: ");
			System.out.println("Lepas connect to repo");
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	private static boolean connectToRepository(String input) {
		try {
			convertSendtoMirth(input);
		}catch(Exception e) {
			System.out.println("FALSEEEEEEE		:: ");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static void convertSendtoMirth(String input) {
		try {
			isSent = true;
			throw new Exception();
		}catch(Exception e) {
			isSent = false;
			e.printStackTrace();
		}
	}

}
