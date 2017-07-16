package com.cts.service.impl;

import java.util.List;

import com.cts.request.TicketRequest;
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
	public int getTicketsCount(TicketRequest request) {
		return ticketDao.getTicketsCount(request);
	}

	@Override
	public List<TicketDto> getTickets(TicketRequest request) {
		return ticketDao.getTickets(request);
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
