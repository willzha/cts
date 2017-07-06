package com.cts.service;

import java.util.List;

import com.cts.dto.BillDto;
import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;

public interface BillService {

	List<BillDto> getBills(int ticketId);

	void saveBills(List<BillDto> bills);

}
