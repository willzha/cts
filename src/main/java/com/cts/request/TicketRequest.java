package com.cts.request;

import java.io.Serializable;

public class TicketRequest extends BaseRequest implements Serializable {
	private String companyId;
	private String selectionNumber;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getSelectionNumber() {
		return selectionNumber;
	}

	public void setSelectionNumber(String selectionNumber) {
		this.selectionNumber = selectionNumber;
	}
}
