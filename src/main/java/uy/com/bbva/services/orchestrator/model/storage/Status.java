package uy.com.bbva.services.orchestrator.model.storage;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Status implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public Status() {
	}

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status(java.lang.String id, java.lang.String name) {
		this.id = id;
		this.name = name;
	}
	
	 public Status (Status s){
        this.id = s.id;
        this.name = s.name;
    }

}