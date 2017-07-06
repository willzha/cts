package com.cts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.DomesticSaleDao;
import com.cts.dto.DomesticSaleDto;
import com.cts.service.DomesticService;

@Service
public class DomesticServiceImpl implements DomesticService {

	@Autowired
	private DomesticSaleDao domesticDao;

	@Override
	public List<DomesticSaleDto> getDomestics() {
		return domesticDao.getDomestics();
	}

	@Override
	public void saveDomestics(List<DomesticSaleDto> domestics) {
		domesticDao.saveDomestics(domestics);
	}

}
