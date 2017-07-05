package com.cts.ws.impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.cxf.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dto.CompanyDto;
import com.cts.dto.EnumDto;
import com.cts.enums.CompanyType;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.MasterDataService;
import com.cts.ws.MasterDataWebService;
import com.google.common.collect.Lists;

@Service
public class MasterDataWebServiceImpl implements MasterDataWebService {

	@Autowired
	private MasterDataService masterDataService;

	@Override
	public CtsResponse getCompanyType() {
		List<EnumDto> companies = Lists.newArrayList(CompanyType.values()).stream().map(e -> new EnumDto(e.getDbConstant(), e.getText()))
				.collect(Collectors.toList());
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(companies);
		return response;
	}

	@Override
	public CtsResponse getCompanies(int type) {
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(masterDataService.getCompanies(type));
		return response;
	}

	@Override
	public CtsResponse saveCompanies(List<CompanyDto> companyDtos) {
		masterDataService.saveCompanies(companyDtos);
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}

	@Override
	public CtsResponse removeCompany(String ids) {
		List<Long> companyIds = Lists.newArrayList();
		String[] strIds = StringUtils.split(ids, ",");
		for (String str : strIds) {
			try {
				companyIds.add(Long.valueOf(str));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			}
		}
		if (CollectionUtils.isNotEmpty(companyIds)) {
			masterDataService.removeCompanies(companyIds);
		}
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}
}
