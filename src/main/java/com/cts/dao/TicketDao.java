package com.cts.dao;

import java.util.List;

import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;

public interface TicketDao {

	List<TicketDto> getTickets();

	void saveTickets(List<TicketDto> tickets);

	TicketNumberDto getCurrentTicketNumber(String groups);

	int addTicketNumber(TicketNumberDto ticketNumberDto);
}
