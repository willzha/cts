package com.cts.ws.impl;

import java.util.List;

import com.cts.aspect.CheckAuthority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dto.DomesticSaleDto;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.DomesticService;
import com.cts.ws.DomesticWebService;

@Service
public class DomesticWebServiceImpl implements DomesticWebService {

	@Autowired
	private DomesticService domesticService;

	@Override
	@CheckAuthority
	public CtsResponse getDomestics() {
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(domesticService.getDomestics());
		return response;
	}

	@Override
	@CheckAuthority
	public CtsResponse saveDomestics(List<DomesticSaleDto> domestics) {
		domesticService.saveDomestics(domestics);
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}

}
