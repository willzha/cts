package com.cts.dao;

import java.util.List;

import com.cts.dto.BillDto;
import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;

public interface BillDao {

	List<BillDto> getBills(int ticketId);

	void saveBills(List<BillDto> bills);
}
