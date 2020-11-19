package GetJsonData.util;

import java.awt.TextArea;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReplaceTagHTML {

	public static void main(String[] args) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get("C:\\dumparea\\MyHIX\\json.txt")));
		
//		TextArea txt = content;
//		content = content.replace(System.getProperty("line.separator"),"<br>");
//		content = content.replaceAll("\\r|\\n", "");
		if(content.contains("\n")) {
			System.out.println("msok");
		}
		System.out.println(content);
		
	}

}
