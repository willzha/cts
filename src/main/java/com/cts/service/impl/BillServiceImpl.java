package com.cts.service.impl;

import java.util.List;

import com.cts.dao.BillDao;
import com.cts.dto.BillDto;
import com.cts.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.TicketDao;
import com.cts.dto.TicketDto;
import com.cts.dto.TicketNumberDto;
import com.cts.service.TicketService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillDao billDao;

	@Override
	public List<BillDto> getBills() {
		return billDao.getBills();
	}

	@Override
	public void saveBills(List<BillDto> bills) {
		billDao.saveBills(bills);
	}

}
