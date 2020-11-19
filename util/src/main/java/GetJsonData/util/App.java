package GetJsonData.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	String jsonDir = "C:\\Practice\\DeviceIntegrationData\\Data\\resultInvestigationsDevice.json";
//    	String jsonDir = "C:\\Practice\\DeviceIntegrationData\\Data\\userid.json";
    	System.out.println(extractJsonValue(jsonDir));
    	
    	
    }

	private static String extractJsonValue(String jsonDir) throws FileNotFoundException {
		File myObj = new File(jsonDir);
		Scanner myReader = new Scanner(myObj);
      	String jsonVal = "";
        String[] arrJson = null;
        int count = 0;
        int finalLine = 0;
        String iden1 = "\"{\"format_type\": \"image/jpeg\"}\"";
        String iden2 = "\"{\"format_type\": \"application/pdf\"}\"";
        String change1 = "\"{\"\"format_type\"\": \"\"image/jpeg\"\"}\"";
        String change2 = "\"{\"\"format_type\"\": \"\"application/pdf\"\"}\"";
        
        while(myReader.hasNext()) {
        	String data = myReader.nextLine();
        	finalLine++;
        	if(data.equals("},")) {
        		break;
        	}
        }
        arrJson = new String[finalLine];
        
		while (myReader.hasNextLine()) {
		      String data = myReader.nextLine();
		      count++;
		      if(count > 1 && count < finalLine) {
				  arrJson[count-1] = data.substring(0, data.indexOf(':') + 1);
			  }
		      jsonVal = jsonVal + data;
	    }
		
	    for(int i=1; i<=finalLine-2; i++) {
			  jsonVal = jsonVal.replace(arrJson[i], "");
	    }
	    jsonVal = jsonVal.replace("{ ", "(");
	    jsonVal = jsonVal.replace("},", "),\n");
	    jsonVal = jsonVal.replace("} ]", ")");
    	jsonVal = jsonVal.contains(iden1) ? jsonVal.replace(iden1, change1) : jsonVal;
    	jsonVal = jsonVal.contains(iden2) ? jsonVal.replace(iden2, change2) : jsonVal;

    	myReader.close();
	    
	    myObj = null;
	    arrJson = null;
	    finalLine = 0;
	    count = 0;
	    
		return jsonVal;
	}
}
