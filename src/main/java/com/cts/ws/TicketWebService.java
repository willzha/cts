package com.cts.ws;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

import com.cts.dto.TicketDto;
import com.cts.response.CtsResponse;

@Controller
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/ticket")
public interface TicketWebService {

	@GET
	@Path("/")
	CtsResponse getTickets();

	@POST
	@Path("/")
	CtsResponse saveTickets(List<TicketDto> tickets);

}
