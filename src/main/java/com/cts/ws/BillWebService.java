package com.cts.ws;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cts.dto.BillDto;
import com.cts.request.BillRequest;
import org.springframework.stereotype.Controller;

import com.cts.response.CtsResponse;

@Controller
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/bill")
public interface BillWebService {

	@GET
	@Path("/")
	CtsResponse getBills(@QueryParam("ticketId") int ticketId);

	@POST
	@Path("/")
	CtsResponse saveBills(BillRequest request);

}
