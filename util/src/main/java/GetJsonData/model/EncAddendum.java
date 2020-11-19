package GetJsonData.model;

public class EncAddendum {
	private String addendumId;
	private String parentDocId;
	private String encounterId;
	
	public EncAddendum(String addendumId, String parentDocId, String encounterId) {
		super();
		this.addendumId = addendumId;
		this.parentDocId = parentDocId;
		this.encounterId = encounterId;
	}
	
	public String getAddendumId() {
		return addendumId;
	}
	public void setAddendumId(String addendumId) {
		this.addendumId = addendumId;
	}
	public String getParentDocId() {
		return parentDocId;
	}
	public void setParentDocId(String parentDocId) {
		this.parentDocId = parentDocId;
	}
	public String getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(String encounterId) {
		this.encounterId = encounterId;
	}
	
	
}
