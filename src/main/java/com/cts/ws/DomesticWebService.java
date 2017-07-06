package com.cts.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.cts.dto.DomesticSaleDto;
import org.springframework.stereotype.Controller;

import com.cts.request.BillRequest;
import com.cts.response.CtsResponse;

import java.util.List;

@Controller
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/domestic")
public interface DomesticWebService {

	@GET
	@Path("/")
	CtsResponse getDomestics();

	@POST
	@Path("/")
	CtsResponse saveDomestics(List<DomesticSaleDto> domestics);

}
