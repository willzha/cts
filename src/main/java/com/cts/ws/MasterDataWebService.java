package com.cts.ws;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

import com.cts.dto.CompanyDto;
import com.cts.response.CtsResponse;

@Controller
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/masterdata")
public interface MasterDataWebService {

	@GET
	@Path("/company/types")
	CtsResponse getCompanyType();

	@GET
	@Path("/companies")
	CtsResponse getCompanies(@QueryParam("type") int type);

	@POST
	@Path("/company")
	CtsResponse saveCompanies(List<CompanyDto> companyDtos);

	@GET
	@Path("/company/remove")
	CtsResponse removeCompany(@QueryParam("id") @Encoded String ids);
}
