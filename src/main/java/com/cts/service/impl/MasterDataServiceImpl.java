package com.cts.service.impl;

import com.cts.dao.MasterDataDao;
import com.cts.dto.CompanyDto;
import com.cts.service.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MasterDataServiceImpl implements MasterDataService {

	@Autowired
	private MasterDataDao masterDataDao;

	@Override
	public List<CompanyDto> getCompanies(int type) {
		return masterDataDao.getCompanies(type);
	}

	@Override
	public void saveCompanies(List<CompanyDto> companyDtos) {
		masterDataDao.saveCompanies(companyDtos);
	}

	@Override
	public void removeCompanies(List<Long> companyIds) {
		masterDataDao.removeCompanies(companyIds);
	}
}
