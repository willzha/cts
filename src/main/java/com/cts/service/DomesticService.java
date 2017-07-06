package com.cts.service;

import java.util.List;

import com.cts.dto.BillDto;
import com.cts.dto.DomesticSaleDto;

public interface DomesticService {

	List<DomesticSaleDto> getDomestics();

	void saveDomestics(List<DomesticSaleDto> bills);

}
