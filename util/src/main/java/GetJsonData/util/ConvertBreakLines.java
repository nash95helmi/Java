package GetJsonData.util;

public class ConvertBreakLines {

	public static void main(String[] args) {
		String[] lineBreak = {"<br>","/n","ccc  ddd",};
		
		String input = "Plan: ccc  ddd (d/w ms elaine) ccc  ddd 1.sigmoidoscopy on 25/9/17 under ms elaine list ccc  ddd 2.to decide regarding for CT TAP and future after sigmoidosco";
//		input = replaceNewLine(lineBreak, input, "\n");
		input = replaceNewLine(lineBreak, input, "<br>");
		System.out.println(input);
	}
	
	private static String replaceNewLine(String[] separator, String inp, String change) {
		String res = "";
		String out = "";
		if(inp != null && inp != ""){
			if(change != null) {
				res = inp.replaceAll(separator[0], change);
				for(int i = 1; i < separator.length; i++) {
					out = res.replaceAll(separator[i], change);
					res = out;
					out = null;
				}
			}
		}
		return res;
	}
}
