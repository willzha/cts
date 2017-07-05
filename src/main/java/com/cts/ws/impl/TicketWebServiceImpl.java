package com.cts.ws.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.TicketService;
import com.cts.ws.TicketWebService;
import com.google.common.collect.Lists;

@Service
public class TicketWebServiceImpl implements TicketWebService {

	@Autowired
	private TicketService ticketService;

	@Override
	public CtsResponse getTickets() {
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(ticketService.getTickets());
		return response;
	}

	@Override
	public CtsResponse saveTickets(List<TicketDto> tickets) {
		List<TicketDto> result = Lists.newArrayList();
		for (TicketDto ticket : tickets) {
			if (ticket.getId() != 0) {
				// if wanna update ticket
				// can't update quality, start number, end number, pickup date.
				// just update delivery date and company id
				result.add(ticket);
				continue;
			}
			int quality = ticket.getQuantity();
			String groups = ticket.getPickupDate().toString("yyyyMMdd");
			TicketNumberDto ticketNumberDto = ticketService.getCurrentTicketNumber(groups);
			int currentTicketNumber = ticketNumberDto.getNumber();
			ticket.setStartNumber(currentTicketNumber + 1);
			ticket.setEndNumber(currentTicketNumber + quality);
			boolean updated = updateTicketNumber(groups, currentTicketNumber + quality, ticketNumberDto.getVersion() + 1);
			if (updated) {
				result.add(ticket);
			}
		}
		ticketService.saveTickets(result);
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}

	private boolean updateTicketNumber(String groups, int number, int version) {
		TicketNumberDto ticketNumber = new TicketNumberDto();
		ticketNumber.setGroups(groups);
		ticketNumber.setNumber(number);
		ticketNumber.setVersion(version);
		int rowcount = ticketService.addTicketNumber(ticketNumber);
		return rowcount == 1;
	}

}
