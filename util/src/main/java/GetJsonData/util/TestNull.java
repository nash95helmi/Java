package GetJsonData.util;

import GetJsonData.model.EncAddendum;

public class TestNull {

	public static void main(String[] args) {
		EncAddendum encAdd = new EncAddendum("123", null, "222");
		
		if(encAdd.getParentDocId() != null){
			System.out.println("ParentDocId :: "+encAdd.getParentDocId());
		}else {
			System.out.println("ParentDocId :: "+encAdd.getParentDocId());
		}
		
	}

}
