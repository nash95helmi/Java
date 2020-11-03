package javaInterview.test.wireCard;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String[] s1 = {"ref_generaldisciplines",
				"ref_locations",
				"ref_generaldisciplines",
				"ref_entitlement_class",
				"ref_locations",
				"ref_generaldisciplines",
				"ref_entitlement_class",
				"ref_generaldisciplines",
				"ref_generaldisciplines",
				"ref_generaldisciplines",
				"ref_entitlement_class",
				"ref_locations",
				"ref_generaldisciplines",
				"ref_entitlement_class",
				"ref_locations",
				"ref_generaldisciplines",
				"ref_generaldisciplines",
				"ref_entitlement_class",
				"ref_discharge_tags",
				"ref_discharge_tags",
				"ref_discharge_type",
				"ref_dismissal_type",
				"ref_nations",
				"ref_races",
				"ref_genders",
				"ref_marital_status",
				"ref_religions",
				"ref_nations",
				"ref_races",
				"ref_states",
				"ref_nations",
				"ref_states",
				"ref_nations",
				"ref_relations",
				"ref_states",
				"ref_nations",
				"ref_states",
				"ref_nations",
				"ref_delivery_modes",
				"ref_genders",
				"ref_birth_complications",
				"ref_designations",
				"ref_referral_detail",
				"ref_entitlement_patient",
				"ref_generaldisciplines",
				"ref_generaldisciplines",
				"ref_main_disciplines",
				"ref_identification_type"};
		
		
		removeDuplicate(s1);
	}

	
	private static void removeDuplicate(String[] s1) {
		List<String> l1 = new ArrayList<String>();
		
		for(String value : s1) {
			if(!l1.contains(value)) {
				l1.add(value);
			}
		}
		l1.forEach(temp -> {
			System.out.println(temp);
		});
	}

}
