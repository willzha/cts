package com.cts.dao;

import java.util.List;
import java.util.Set;

import com.cts.dto.CompanyDto;
import org.apache.ibatis.annotations.Param;

public interface MasterDataDao {

	List<CompanyDto> getCompanies(@Param("type") int type);

	void saveCompanies(List<CompanyDto> companyDtos);

	void removeCompanies(List<Long> companyIds);
}
