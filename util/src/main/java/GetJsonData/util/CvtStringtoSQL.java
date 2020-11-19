package GetJsonData.util;

public class CvtStringtoSQL {

	public static void main(String[] args) {

		String input =  "<![CDATA[33 y/o, Para 2&lt;br&gt;&lt;br&gt;Day 1 Post SVD&lt;br&gt;-Intrapartum:&lt;br&gt;Uneventful&lt;br&gt;Cord around neck"
				+ " x1- loose&lt;br&gt;EBL 200 cc&lt;br&gt;Placenta complete&lt;br&gt;1st tear repaired&lt;br&gt;               "
				+ "&lt;br&gt;Delivered baby girl @38 POA&lt;br&gt;- BW: 2900 grams&lt;br&gt;- AS 9(1) 10(5)&lt;br&gt;   &lt;br&gt;ANC:&lt;br&gt;1. "
				+ "HbE trait –latest HB 10.7&lt;br&gt;2. H/o low birth weight in 2013 – BW 2.1 kg&lt;br&gt;3. LCB in 2013&lt;br&gt;"
				+ "4. h/o GDM in previous pregnancy –MGTTX2 Normal&lt;br&gt;&lt;br&gt;Upon discharge:&lt;br&gt;Well, afebrile &lt;br&gt;"
				+ "Tolerating orally&lt;br&gt;Ambulating well&lt;br&gt;Breastfeeding established&lt;br&gt;Able to PU, pass flatus.&lt;br&gt;&lt;br&gt;"
				+ "Baby pink, active on handling&lt;br&gt;Already PU and BO in ward&lt;br&gt;Not jaundice tolerating feeding and suckling well&lt;br&gt;           "
				+ "&lt;br&gt;On examination: &lt;br&gt;Alert, conscious, pink&lt;br&gt;BP:126/78&lt;br&gt;PR: 71&lt;br&gt;Temp: 37&lt;br&gt;&lt;br&gt"
				+ ";PA : Soft, non-tender&lt;br&gt;        "
				+ "Uterus well contracted at 16 weeks&lt;br&gt;Normal lochia&lt;br&gt;Minimal stained on pads&lt;br&gt;"
				+ "No calf tenderness&lt;br&gt;&lt;br&gt;Contraception: Barrier method&lt;br&gt;&lt;br&gt;Plan : &lt;br&gt;1. Allow discharge "
				+ "today &lt;br&gt;2. Encourage orally, breastfeeding, ambulation&lt;br&gt;3. Good perineal hygiene&lt;br&gt;4."
				+ " TCA nearest KK x 6/52 for contraception counseling &amp; pap smear &lt;br&gt;5. Discharge with:&lt;br&gt;    "
				+ "- T. PCM 1g QID x 1/52&lt;br&gt;    - Chlorhexidine OD x 1/52&lt;br&gt;    - T. Obimin 1/1 OD x 1/12&lt;br&gt;                                                                                                                                                                                       "
				+ " &lt;br&gt;]]>";
		
		String str2 = "11/Malay/boy/n1st hospitalization/np/w 1/52 low grade fever/nleft loin pain x 1/52/npapular rash x 1/52/nhistory of chicken pox 1/52 prior to "
				+ "symptoms/nno sore throat/n+facial puffiness/nBP on admission 138/94/non admission child alert conscious/nno cutaneous lesions seen at lower limbs/nBP "
				+ "138/94/nPR 64/nLungs clear/nCVS S1S2 no murmur/nPA soft/nrenal punch +ve over left side/nthroat clear/nno tonsil enlargement/nBP centile 99-107/59-63/n"
				+ "urine FEME on admission: blood 2+,protein -ve, leukocyte -ve, nitrites -ve/ncompleted oral penicillin V 500mg QID x 10/7/nstarted on T. nifedipine 5 mg "
				+ "tds, then increased to 7.5 mg tds as BP not improving/nlater increased to 10 mg tds as BP not well controlled/nASOT titre +ve, neat 1u/ml/ncurrently, "
				+ "child comfortable,afebrile/nasymptomatic of hypertensive emergency ( no SOB, no headache, no blurring of vision, no vomitting)/nurine inspection: "
				+ "clear/nI/o: 1500/1600/-100cc/nurine output: "
				+ "1.7cc/kg/hour/no/e child active, alert, pink/nBP 115/90/nPR 90/nT 37/nlungs clear/nCVS DRNM/nPA soft/nImp: AGN secondary to scarlet fever\r\n";  
			
		str2 = str2.replace("/n", "<br>");
//		String out = convert(input);
		System.out.println(str2);
//		String pFront = "<paragraph>";
//		String pEnd = "</paragraph>";
//		String date1 = "1948-06-07";
//		String output = "";
//		input = input.replace("<![CDATA[", "");
//		input = input.replace("]]>", "");
//		String[] result = input.split("&lt;br&gt;");
//		for(String str1 : result) {
//			System.out.println(pFront+str1+pEnd);
//			output += (pFront+str1+pEnd);
//		}
//		System.out.println("Output :: "+output);
//		System.out.println(date1.substring(0, 4)+" "+date1.substring(5, 7)+" "+date1.substring(8, 10));
	}

	
	private static String convert(String input) {
		String pFront = "<paragraph>";
		String pEnd = "</paragraph>";
		String output = "";
		if(input != null || input != "") {
			input = input.replace("<![CDATA[", "");
			input = input.replace("]]>", "");
			String[] result = input.split("&lt;br&gt;");
			for(String str1 : result) {
				System.out.println(pFront+str1+pEnd);
				output += (pFront+str1+pEnd);
			}
		}
		pFront = null; 
		pEnd = null;
		return output;
	}

}