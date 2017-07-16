package com.cts.dao;

import java.util.List;

import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;
import com.cts.request.TicketRequest;

public interface TicketDao {

    List<TicketDto> getTickets(TicketRequest request);

    void saveTickets(List<TicketDto> tickets);

    TicketNumberDto getCurrentTicketNumber(String groups);

    int addTicketNumber(TicketNumberDto ticketNumberDto);

    int getTicketsCount(TicketRequest request);
}
