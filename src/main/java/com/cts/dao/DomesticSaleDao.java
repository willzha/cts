package com.cts.dao;

import java.util.List;

import com.cts.dto.DomesticSaleDto;

public interface DomesticSaleDao {

	List<DomesticSaleDto> getDomestics();

	void saveDomestics(List<DomesticSaleDto> bills);
}
