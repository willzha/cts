package com.cts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.TicketDao;
import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;
import com.cts.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;

	@Override
	public List<TicketDto> getTickets() {
		return ticketDao.getTickets();
	}

	@Override
	public void saveTickets(List<TicketDto> tickets) {
		ticketDao.saveTickets(tickets);
	}

	@Override
	public TicketNumberDto getCurrentTicketNumber(String groups) {
		TicketNumberDto ticketNumberDto = ticketDao.getCurrentTicketNumber(groups);
		if (ticketNumberDto == null) {
			return new TicketNumberDto();
		}
		return ticketNumberDto;
	}

	@Override
	public int addTicketNumber(TicketNumberDto ticketNumberDto) {
		return ticketDao.addTicketNumber(ticketNumberDto);
	}
}
