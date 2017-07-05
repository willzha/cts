package com.cts.service;

import java.util.List;
import java.util.Set;

import com.cts.dto.CompanyDto;

public interface MasterDataService {

	List<CompanyDto> getCompanies(int type);

	void saveCompanies(List<CompanyDto> companyDtos);

	void removeCompanies(List<Long> companyIds);
}
