package GetJsonData.util;

public class SeparatorJSON {

	public static void main(String[] args) {
		String inp = "\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Basophils% 0.60\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Basophils# 0.08\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Eosinophils% 19.20\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Eosinophils# 2.58\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Haematocrit 30.5\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Haemoglobin 11.0\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Lymphocytes% 59.70\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Lymhocytes# 8.02\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) MCH 31.3\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) MCHC 36.1\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) MCV 86.9\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Monocytes% 6.50\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Monocytes# 0.87\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) MPV 8.9\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Neutrophils% 14.00\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Neutrophils# 1.89\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) Platelets 629\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) RDW 14.1\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) TRBC 3.51\\\",\\\"06/11/2019 12:00:11 Full Blood Count (FBC) WBC 13.4\\\"";
		System.out.println(inp.replaceAll("\\\\", ""));
	}

}
