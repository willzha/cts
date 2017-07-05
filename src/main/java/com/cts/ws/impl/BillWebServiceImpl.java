package com.cts.ws.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dto.BillDto;
import com.cts.enums.ResponseEnum;
import com.cts.response.CtsResponse;
import com.cts.service.BillService;
import com.cts.ws.BillWebService;

@Service
public class BillWebServiceImpl implements BillWebService {

	@Autowired
	private BillService billService;

	@Override
	public CtsResponse getBills() {
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		response.setData(billService.getBills());
		return response;
	}

	@Override
	public CtsResponse saveBills(List<BillDto> bills) {
		for (BillDto bill : bills) {
			BigDecimal unitPrice = bill.getUnitPrice();
			if (unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0) {
				bill.setTotalPrice(BigDecimal.ZERO);
			} else {
				int ton = bill.getTon();
				BigDecimal tonDecimal = BigDecimal.valueOf(ton);
				bill.setTotalPrice(unitPrice.multiply(tonDecimal));
			}

			BigDecimal paymentAmount = bill.getPaymentAmount();
			if (paymentAmount == null || paymentAmount.compareTo(BigDecimal.ZERO) <= 0) {
				paymentAmount = BigDecimal.ZERO;
			}
			bill.setBalance(paymentAmount.subtract(bill.getTotalPrice()));
		}
		billService.saveBills(bills);
		CtsResponse response = new CtsResponse();
		response.setCode(ResponseEnum.SUCCESS);
		return response;
	}

}
