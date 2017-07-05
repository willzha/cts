package com.cts.service;

import java.util.List;

import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;

public interface TicketService {

	List<TicketDto> getTickets();

	void saveTickets(List<TicketDto> tickets);

	TicketNumberDto getCurrentTicketNumber(String groups);

	int addTicketNumber(TicketNumberDto ticketNumberDto);
}
