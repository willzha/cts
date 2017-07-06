package com.cts.request;

import java.io.Serializable;
import java.util.List;

import com.cts.dto.BillDto;

public class BillRequest implements Serializable {

	private long ticketId;
	private List<BillDto> bills;

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public List<BillDto> getBills() {
		return bills;
	}

	public void setBills(List<BillDto> bills) {
		this.bills = bills;
	}
}
