package uy.com.bbva.services.orchestrator.model.storage;

import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InternalDocument implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private uy.com.bbva.services.orchestrator.model.storage.InternalDocumentType internalDocumentType;

	public InternalDocument() {
	}

	private String id;
	private Date startDate;
	private Date endDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public uy.com.bbva.services.orchestrator.model.storage.InternalDocumentType getInternalDocumentType() {
		return this.internalDocumentType;
	}

	public void setInternalDocumentType(
			uy.com.bbva.services.orchestrator.model.storage.InternalDocumentType internalDocumentType) {
		this.internalDocumentType = internalDocumentType;
	}

	public InternalDocument(
			uy.com.bbva.services.orchestrator.model.storage.InternalDocumentType internalDocumentType,
			java.lang.String id, java.util.Date startDate,
			java.util.Date endDate) {
		this.internalDocumentType = internalDocumentType;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}